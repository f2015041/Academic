import java.util.*;
class FlightInfo {
	private String fl_no, source, dest;
	private float cost;

	public FlightInfo(String ff_no, String source, String destin,
			  float c) {
		{
			this.fl_no = ff_no;
			this.source = source;
			this.dest = destin;
			this.cost = c;
		} String getsrc() {
			return source;
		}
		String getdest() {
			return dest;
		}
		void display() {
			System.out.println(fl_no + "

