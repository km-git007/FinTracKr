"use client";

import { ClerkProvider } from "@clerk/nextjs";
import { Toaster } from "sonner";

export function Providers({ children }) {
   return (
      <ClerkProvider fallbackRedirectUrl="/dashboard">
         {children}
         <Toaster richColors />
      </ClerkProvider>
   );
}
