"use client";
import { useEffect } from "react";

const TitleSetter = ({ title }) => {
   useEffect(() => {
      document.title = title;
   }, [title]);

   return null; // No UI needed, just updates the title
};

export default TitleSetter;
