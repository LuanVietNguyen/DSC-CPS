package com.example.drreachapps.two_quadcopters_searching_mission;

import edu.illinois.mitra.starlSim.main.SimSettings;
import edu.illinois.mitra.starlSim.main.Simulation;

public class Main {

	public static void main(String[] args) {
		SimSettings.Builder settings = new SimSettings.Builder();
		settings.N_IROBOTS(0);
		settings.N_GHOSTS(0);
		settings.N_IROBOTS(0);
		settings.N_MAVICS(0);
		settings.N_QUADCOPTERS(3);
		settings.TIC_TIME_RATE(5);
		settings.WAYPOINT_FILE("two_quadcopters_searching_mission.wpt");
		settings.INITIAL_POSITIONS_FILE("two_quadcopters_searching_mission_start.wpt");
		settings.DRAW_WAYPOINTS(false);
		settings.DRAW_WAYPOINT_NAMES(false);
		settings.DRAWER(new two_quadcopters_searching_mission_drawer());
		
		Simulation sim = new Simulation(two_quadcopters_searching_mission_app.class, settings.build());
		sim.start();
	}

}
