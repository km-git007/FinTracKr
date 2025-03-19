import React from "react";
import { FaLinkedin, FaGithub } from "react-icons/fa";

const Footer = () => {
   return (
      <footer className="bg-orange-50 text-gray-900 py-8 z-40 relative">
         <div className="container mx-auto px-6 lg:px-14 flex flex-col lg:flex-row lg:justify-between items-center gap-4">
            <div className="text-center lg:text-left">
               <h2 className="text-3xl font-bold mb-2">FinTrackr</h2>
               <p>Track Smart Spend Smarter</p>
            </div>

            <p className="mt-4 lg:mt-0">
               &copy; {new Date().getFullYear()} FinTrackr. All rights reserved.
            </p>

            <div className="flex space-x-6 mt-4 lg:mt-0">
               <a
                  href="https://www.linkedin.com/in/kaustavmishra"
                  target="_blank"
                  rel="noopener noreferrer"
                  className="hover:text-gray-700 dark:hover:text-gray-200"
               >
                  <FaLinkedin size={24} />
               </a>
               <a
                  href="https://github.com/km-git007/FinTrackr"
                  target="_blank"
                  rel="noopener noreferrer"
                  className="hover:text-gray-700 dark:hover:text-gray-200"
               >
                  <FaGithub size={24} />
               </a>
            </div>
         </div>
      </footer>

   );
};

export default Footer;
