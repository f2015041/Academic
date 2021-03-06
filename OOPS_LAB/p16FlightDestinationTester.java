import java.util.Scanner;
import java.util.ArrayList;
class FlightDest {
	private String flightNo, source, destination;
	private float cost;
	public FlightDest(String flightNo, String source,
			  String destination, float cost) {
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		this.cost = cost;
	} public String getFlight() {
		return flightNo;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public float getCost() {
		return cost;
	}
	public void display() {
		System.out.println(flightNo + " " + source + " " +
				   destination + " " + cost);
	}

}

class FlightListInfo {
	ArrayList < FlightDest > fList = new ArrayList <> ();

	public FlightListInfo() {
	} public void addFlightInfo(String fNo, String source, String dest,
				    float cost) {
		fList.add(new FlightDest(fNo, source, dest, cost));


	}

	public ArrayList < FlightDest >
	    getFlightSrcDest(String source, String dest) {
		ArrayList < FlightDest > List = new ArrayList <> ();
		FlightDest temp;
		for (int i = 0; i < fList.size(); i++) {
			temp = fList.get(i);
			if (temp.getSource().equals(source)
			    && temp.getDestination().equals(dest))

				List.add(temp);
		}
		return List;

	}
}

public class p16FlightDestinationTester {
	public static void main(String[]args) {

		Scanner inp = new Scanner(System.in);
		String f, s, d;
		FlightListInfo flight = new FlightListInfo();
		float c;
		do {

			System.out.
			    println
			    ("Enter flight no, source, destination, cost: ");
			f = inp.next();
			if (f.equals("END"))
				break;
			s = inp.next();
			d = inp.next();
			c = inp.nextFloat();
			flight.addFlightInfo(f, s, d, c);
		} while (true);

		System.out.println("Enter source,destination: ");
		s = inp.next();
		d = inp.next();
		ArrayList < FlightDest > op = new ArrayList <> ();
		op = flight.getFlightSrcDest(s, d);
		System.out.
		    println
		    ("List of flights from given source and destination");

	      for (FlightDest temp:op)
			temp.display();
	}
}
