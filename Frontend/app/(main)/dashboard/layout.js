import DashboardPage from "./page";
import { BarLoader } from "react-spinners";
import TitleSetter from "@/components/TitleSetter"; // Import the client component
import { Suspense } from "react";

export default function Layout() {

   return (
      <div className="px-5">
         <TitleSetter title="FinTrackr | Dashboard" />
         <div className="flex items-center justify-between mb-5">
            <h1 className="text-6xl font-bold tracking-tight gradient-title-16 animate-gradient">
               Dashboard
            </h1>
         </div>
         <Suspense
            fallback={<BarLoader className="mt-4" width={"100%"} color="#9333ea" />}
         >
            <DashboardPage />
         </Suspense>
      </div>
   );
}
