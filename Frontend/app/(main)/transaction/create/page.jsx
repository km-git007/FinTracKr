// import { getUserAccounts } from "@/actions/dashboard";
// import { defaultCategories } from "@/data/categories";
// import { AddTransactionForm } from "../_components/transaction-form";
// import { getTransaction } from "@/actions/transaction";

// export default async function AddTransactionPage({ searchParams }) {
//   const accounts = await getUserAccounts();
//   const editId = searchParams?.edit;

//   let initialData = null;
//   if (editId) {
//     const transaction = await getTransaction(editId);
//     initialData = transaction;
//   }

//   return (
//     <div className="max-w-3xl mx-auto px-5">
//       <div className="flex justify-center md:justify-normal mb-8">
//         <h1 className="text-5xl gradient-title ">Add Transaction</h1>
//       </div>
//       <AddTransactionForm
//         accounts={accounts}
//         categories={defaultCategories}
//         editMode={!!editId}
//         initialData={initialData}
//       />
//     </div>
//   );
// }

// "use client"; // ✅ Mark it as a Client Component

// import { useSearchParams } from "next/navigation";
// import { useEffect, useState } from "react";
// import { getUserAccounts } from "@/actions/dashboard";
// import { defaultCategories } from "@/data/categories";
// import { AddTransactionForm } from "../_components/transaction-form";
// import { getTransaction } from "@/actions/transaction";
// import TitleSetter from "@/components/TitleSetter"; // Import the client component


// export default function AddTransactionPage() {
//    const searchParams = useSearchParams();
//    const editId = searchParams.get("edit"); // ✅ Correct way to access searchParams

//    const [accounts, setAccounts] = useState([]);
//    const [initialData, setInitialData] = useState(null);

//    useEffect(() => {
//       async function fetchData() {
//          const accountsData = await getUserAccounts();
//          setAccounts(accountsData);

//          if (editId) {
//             const transaction = await getTransaction(editId);
//             setInitialData(transaction);
//          }
//       }

//       fetchData();
//    }, [editId]);

//    return (
//       <div className="max-w-3xl mx-auto px-5">
//          <TitleSetter title="FinTrackr | Transaction" />
//          <div className="flex justify-center md:justify-normal mb-8">
//             <h1 className="text-5xl text-center gradient-title-16">Add Transaction</h1>
//          </div>
//          <AddTransactionForm
//             accounts={accounts}
//             categories={defaultCategories}
//             editMode={!!editId}
//             initialData={initialData}
//          />
//       </div>
//    );
// }

"use client"; // ✅ Mark it as a Client Component

import { useSearchParams } from "next/navigation";
import { useEffect, useState, Suspense } from "react";
import { getUserAccounts } from "@/actions/dashboard";
import { defaultCategories } from "@/data/categories";
import { AddTransactionForm } from "../_components/transaction-form";
import { getTransaction } from "@/actions/transaction";
import TitleSetter from "@/components/TitleSetter"; // Import the client component

function AddTransactionComponent() {
   const searchParams = useSearchParams();
   const editId = searchParams.get("edit"); // ✅ Correct way to access searchParams

   const [accounts, setAccounts] = useState([]);
   const [initialData, setInitialData] = useState(null);

   useEffect(() => {
      async function fetchData() {
         const accountsData = await getUserAccounts();
         setAccounts(accountsData);

         if (editId) {
            const transaction = await getTransaction(editId);
            setInitialData(transaction);
         }
      }

      fetchData();
   }, [editId]);

   return (
      <div className="max-w-3xl mx-auto px-5">
         <TitleSetter title="FinTrackr | Transaction" />
         <div className="flex justify-center md:justify-normal mb-8">
            <h1 className="text-5xl text-center gradient-title-16">Add Transaction</h1>
         </div>
         <AddTransactionForm
            accounts={accounts}
            categories={defaultCategories}
            editMode={!!editId}
            initialData={initialData}
         />
      </div>
   );
}

export default function AddTransactionPage() {
   return (
      <Suspense fallback={<div>Loading transaction form...</div>}>
         <AddTransactionComponent />
      </Suspense>
   );
}

