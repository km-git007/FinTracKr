import { SignIn } from "@clerk/nextjs";
import TitleSetter from "@/components/TitleSetter"; // Import the client component

export default function Page() {
  return <>
  <TitleSetter title="FinTrackr | SignIn" />
  <SignIn /></>;
}
