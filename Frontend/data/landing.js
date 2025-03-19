import {
   BarChart3,
   Receipt,
   PieChart,
   CreditCard,
   Globe,
   Zap,
} from "lucide-react";

// Stats Data
export const statsData = [
   {
      value: "2K",
      label: "Monthly Active Users",
   },
   {
      value: "$1M+",
      label: "Transactions Managed",
   },
   {
      value: "10K+",
      label: "Receipts Scanned",
   },
   {
      value: "4.85/5",
      label: "User Rating",
   },
];

// Features Data
export const featuresData = [
   {
      icon: <Zap className="h-8 w-8 text-blue-600" />,
      title: "AI-Driven Financial Insights",
      description: "Receive automated recommendations to improve your financial health.",
   },
   {
      icon: <Receipt className="h-8 w-8 text-blue-600" />,
      title: "AI-Powered Receipt Scanner",
      description: "Effortlessly extract data from receipts using advanced AI technology.",
   },
   {
      icon: <PieChart className="h-8 w-8 text-blue-600" />,
      title: "Smart Budgeting",
      description: "Plan and manage your budgets with intelligent suggestions.",
   },
   {
      icon: <CreditCard className="h-8 w-8 text-blue-600" />,
      title: "Seamless Multi-Account Management",
      description: "Keep track of multiple bank accounts and credit cards in one place.",
   },
   {
      icon: <BarChart3 className="h-8 w-8 text-blue-600" />,
      title: "In-Depth Analytics",
      description: "Gain valuable insights into your spending with AI-driven analytics.",
   },
   {
      icon: <Globe className="h-8 w-8 text-blue-600" />,
      title: "Global Currency Support",
      description: "Manage multiple currencies with real-time exchange rates.",
   }

];


// How It Works Data
export const howItWorksData = [
   {
      icon: <CreditCard className="h-8 w-8 text-blue-600" />,
      title: "1. Sign Up Easily",
      description: "Create an account quickly and securely to get started.",
   },
   {
      icon: <BarChart3 className="h-8 w-8 text-blue-600" />,
      title: "2. Monitor Your Expenses",
      description: "Automatically categorize transactions and track spending in real time.",
   },
   {
      icon: <PieChart className="h-8 w-8 text-blue-600" />,
      title: "3. Gain Actionable Insights",
      description: "Leverage AI-powered recommendations to optimize your finances.",
   },
];


// Testimonials Data
export const testimonialsData = [
   {
      name: "Aditi Sharma",
      role: "Startup Founder",
      image: "https://randomuser.me/api/portraits/women/15.jpg", // Replace with an Indian image if needed
      quote:
         "Managing finances has never been easier! FinTrackr’s AI-driven insights have helped me scale my business efficiently.",
   },
   {
      name: "Rohan Mehta",
      role: "Freelancer",
      image: "https://randomuser.me/api/portraits/men/17.jpg", // Replace with an Indian image if needed
      quote:
         "The automated expense tracking has saved me a ton of time. Now, I can focus on my projects without worrying about financial paperwork.",
   },
   {
      name: "Neha Kapoor",
      role: "Investment Analyst",
      image: "https://randomuser.me/api/portraits/women/16.jpg", // Replace with an Indian image if needed
      quote:
         "FinTrackr is an excellent financial management tool. The multi-currency and budget planning features are perfect for international investments.",
   },
];

