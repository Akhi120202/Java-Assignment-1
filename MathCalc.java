public class MathCalc {
        public static void main(String[] args) {

            // Calculate the radius of a circle with a given area
        double circleArea = 100.0;
        double radius = Math.sqrt(circleArea / Math.PI);

        // Convert the radius into feet and inches
        int feet = (int) Math.floor(radius);
        int inches = (int) Math.round(12.0 * (radius - feet));

        // Output the radius of the circle
        System.out.println("The radius of a circle with area " + circleArea + " square feet is " + feet + " feet " + inches + " inches");
            
        // Earth and Sun diameters
            double earthDiameter = 7600.0;
            double sunDiameter = 865000.0;
    
            // Calculate the radius of Earth and Sun
            double earthRadius = earthDiameter / 2.0;
            double sunRadius = sunDiameter / 2.0;
    
            // Calculate the volumes of Earth and Sun using the sphere volume formula
            double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
            double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);
    
            // Calculate the ratio of Sun's volume to Earth's volume
            double volumeRatio = sunVolume / earthVolume;
    
            
            System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
            System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
            System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);
        }
    
    
}
