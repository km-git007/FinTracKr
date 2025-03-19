import React from "react";
import { Button } from "@/components/ui/button";
import { Card, CardContent } from "@/components/ui/card";
import Image from "next/image";
import {
   featuresData,
   howItWorksData,
   statsData,
   testimonialsData,
} from "@/data/landing";
import HeroSection from "@/components/hero";
import Link from "next/link";

const LandingPage = () => {
   return (
      <div className="min-h-screen bg-white">
         {/* Hero Section */}
         <HeroSection />

         {/* Stats Section */}
         <section id="stats" className="py-20 bg-blue-50">
            <div className="container mx-auto px-4">
               <div className="grid grid-cols-2 md:grid-cols-4 gap-8">
                  {statsData.map((stat, index) => (
                     <div key={index} className="text-center">
                        <div className="text-4xl font-bold text-blue-600 mb-2">
                           {stat.value}
                        </div>
                        <div className="text-gray-600">{stat.label}</div>
                     </div>
                  ))}
               </div>
            </div>
         </section>

         {/* Features Section */}
         <section id="features" className="py-20">
            <div className="container mx-auto px-4">
               <h2 className="text-3xl font-bold text-center mb-12">
                  Effortless Finance Management at Your Fingertips
               </h2>
               <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
                  {featuresData.map((feature, index) => (
                     <Card className="p-6" key={index}>
                        <CardContent className="space-y-4 pt-4">
                           {feature.icon}
                           <h3 className="text-xl font-semibold">{feature.title}</h3>
                           <p className="text-gray-600">{feature.description}</p>
                        </CardContent>
                     </Card>
                  ))}
               </div>
            </div>
         </section>

         {/* How It Works Section */}
         <section className="py-20 bg-blue-50">
            <div className="container mx-auto px-4">
               <h2 className="text-3xl font-bold text-center mb-16">Steps to Get Started</h2>
               <div className="grid grid-cols-1 md:grid-cols-3 gap-12">
                  {howItWorksData.map((step, index) => (
                     <div key={index} className="text-center">
                        <div className="w-16 h-16 bg-blue-100 rounded-full flex items-center justify-center mx-auto mb-6">
                           {step.icon}
                        </div>
                        <h3 className="text-xl font-semibold mb-4">{step.title}</h3>
                        <p className="text-gray-600">{step.description}</p>
                     </div>
                  ))}
               </div>
            </div>
         </section>

         {/* Testimonials Section */}
         <section id="testimonials" className="py-20">
            <div className="container mx-auto px-4">
               <h2 className="text-3xl font-bold text-center mb-16">
                  Feedback from Our Community
               </h2>
               <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
                  {testimonialsData.map((testimonial, index) => (
                     <Card key={index} className="p-6">
                        <CardContent className="pt-4">
                           <div className="flex items-center mb-4">
                              <Image
                                 src={testimonial.image}
                                 alt={testimonial.name}
                                 width={40}
                                 height={40}
                                 className="rounded-full"
                              />
                              <div className="ml-4">
                                 <div className="font-semibold">{testimonial.name}</div>
                                 <div className="text-sm text-gray-600">
                                    {testimonial.role}
                                 </div>
                              </div>
                           </div>
                           <p className="text-gray-600">{testimonial.quote}</p>
                        </CardContent>
                     </Card>
                  ))}
               </div>
            </div>
         </section>
      </div>
   );
};

export default LandingPage;
