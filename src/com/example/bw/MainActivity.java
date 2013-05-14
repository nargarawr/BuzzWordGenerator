package com.example.bw;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends Activity {

	/*

	Ignore the huge hard coded array, I was just learning how to use Android.
	Expansion for this would to be an online database (or local database) that would be read from

	*/

	String[] listOfWords = { "Alignment", "At the end of the day",
			"Break through the clutter", "Bring to the table", "Buzzword",
			"Clear goal", "Countless", "Diversity", "Empowerment",
			"Exit strategy", "Face time", "Fun", "Generation X",
			"Globalization", "Grow", "Impact", "Leverage", "Milestone",
			"Moving forward", "On the runway", "Organic growth",
			"Outside the box", "Paradigm", "Paradigm shift", "Proactive",
			"Reach out", "Sea change", "Spin-up", "Streamline",
			"Survival strategy", "Sustainability", "Synergy", "Wellness",
			"Win-win", "Accountable talk", "Higher-order thinking",
			"Invested in", "Run like a business", "Analytics",
			"Ballpark figure", "Bandwidth", "Business-to-Business",
			"Business-to-Consumer", "Best of Breed", "Best practices",
			"Bizmeth", "Brand", "Brick-and-mortar",
			"Business process outsourcing", "Buzzword compliant",
			"Building Capabilities", "Client-centric", "Co-opetition",
			"Core competency", "Customer-centric", "Debuzzifiy", "Downsizing",
			"Drinking the Kool-Aid", "Eating your own dogfood", "Enable",
			"Entitlement", "Enterprise", "Event horizon", "Eyeballs",
			"Free value", "Fulfilment issues", "Granular", "Herding cats",
			"Holistic", "Hyperlocal", "Knowledge Process Outsourcing",
			"Leverage", "Logistics", "Long Tail", "Low Hanging Fruit",
			"Make it pop", "Mindshare", "Mission Critical",
			"Management Visibility", "New economy", "Next generation",
			"Offshoring", "Pain point", "Return on Investment",
			"Reverse fulfilment", "Rightshoring", "Seamless (integration)",
			"Serum", "Share options", "Solution", "SOX", "Sustainability",
			"Touchpoint", "Value-added", "Visibility", "3G", "Aggregator",
			"Ajax", "Benchmarking", "Back-end", "Beta", "Big data",
			"Bleeding edge", "Blog", "Bluetooth", "Bring your own Device",
			"Bricks-and-clicks", "Clickthrough", "Cloud", "Collaboration",
			"Content management", "Content Management System", "Convergence",
			"Cross-platform", "Data science", "Deep dive", "Design pattern",
			"DevOps", "Digital divide", "Digital Remastering",
			"Digital Rights Management", "Digital signage",
			"Document management", "Dot-bomb", "Download", "E-learning",
			"Engine", "Enterprise Content Management",
			"Enterprise Service Bus", "Framework", "Folksonomy", "Fuzzy logic",
			"HTML5", "Immersion", "Information superhighway", "Innovation",
			"Mashup", "Mobile", "Modularity", "Nanotechnology", "Netiquette",
			"Next Generation", "PaaS", "Pizzazz", "Podcasting", "Portal",
			"Real-time", "Responsive", "SaaS", "Scalability",
			"Social bookmarking", "Social software", "Spam", "Struts",
			"Sync-up", "Tagging", "Think outside the box", "Transmedia",
			"User generated content", "Virtualization", "Vlogging", "Vortal",
			"Web 2.0", "Webinar", "Weblog", "Web services", "Wikiality",
			"Workflow", "Pandering", "Big society", "Information society",
			"Political capital", "Socialist", "Stakeholder", "Truthiness",
			"Warfighter", "Plutocracy", "Best-in-class", "Tiptronic" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView t = (TextView) findViewById(R.id.textView2);
		t.setText(randomWord());
		
		final Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView t = (TextView) findViewById(R.id.textView2);
				t.setText(randomWord());
			}
		});
	}
	
	public String randomWord() {
		final Random rand = new Random();
		int r = rand.nextInt(listOfWords.length);
		return listOfWords[r];
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
