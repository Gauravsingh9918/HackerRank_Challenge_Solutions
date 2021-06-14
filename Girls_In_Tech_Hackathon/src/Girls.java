import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Girls {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int totalTeams = Integer.parseInt(br1.readLine());
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String extraTimePerTeamString = br2.readLine();
		
		String[] extraTimePerTeam = extraTimePerTeamString.split(" ");
		HashMap<Integer, Integer> extraTimePerTeamMap = new HashMap<Integer, Integer>();
		if(extraTimePerTeam.length != totalTeams) {
			System.exit(0);;
		} else {
			/*
			* Map with extra time per team
			*/
			for(int i=1; i <= extraTimePerTeam.length; i++) {
				extraTimePerTeamMap.put(i, Integer.parseInt(extraTimePerTeam[i-1]));
			}
			int count = 0;
			for(Integer i : extraTimePerTeamMap.keySet()) {
				if(i > extraTimePerTeamMap.get(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
