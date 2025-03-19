import { Inter } from "next/font/google";
import "./globals.css";
import Header from "@/components/header";
import TitleSetter from "@/components/TitleSetter"; // Import the client component
import Footer from "@/components/Footer";
import { Providers } from "./providers"; // ✅ Import the new Providers component

const inter = Inter({ subsets: ["latin"] });

export const metadata = {
   title: "FinTrackr",
   description: "One stop Finance Platform",
};

export default function RootLayout({ children }) {
   return (
      <html lang="en">
         <head>
            <link rel="icon" href="/logo-sm.png" sizes="any" />
         </head>
         <body className={`${inter.className}`}>
            <TitleSetter title="FinTrackr | Home" />
            <Providers>
               <Header />
               <main className="min-h-screen">{children}</main>
               <Footer />
            </Providers>
         </body>
      </html>
   );
}
