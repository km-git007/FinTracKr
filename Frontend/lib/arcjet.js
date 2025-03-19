import arcjet, { tokenBucket } from "@arcjet/next";

const aj = arcjet({
   key: process.env.ARCJET_KEY,
   characteristics: ["userId"], // Track based on Clerk userId
   rules: [
      // Rate limiting specifically for collection creation
      tokenBucket({
         mode: "LIVE",
         refillRate: 5, // 10 collections
         interval: 86400, // Every 24 hours
         capacity: 5, // maximum burst capacity
      }),
   ],
});

export default aj;
