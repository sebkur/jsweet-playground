package de.topobyte;

import static def.dom.Globals.console;
import static def.dom.Globals.document;
import static def.dom.Globals.window;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.topobyte.geomath.WGS84;
import def.dom.Document;
import def.dom.Element;
import def.dom.HTMLElement;

public class Main
{

	static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args)
	{
		window.onload = e -> {
			return new Main();
		};
	}

	public Main()
	{
		console.info("constructor");

		logger.info("logging something here");

		Element body = document.getElementsByTagName("body").item(0);

		body.appendChild(document.createElement("br"));

		double lon = 13.4;
		double lat = 52.1;

		appendLine(body, "line 1: ", lon + ": " + WGS84.lon2merc(lon));
		appendLine(body, "line 2: ", lat + ": " + WGS84.lat2merc(lat));
	}

	private void appendLine(Element element, String first, String second)
	{
		Document document = element.ownerDocument;
		HTMLElement span1 = document.createElement("span");
		HTMLElement span2 = document.createElement("span");
		span1.textContent = first;
		span2.textContent = second;
		element.appendChild(span1);
		element.appendChild(span2);
		element.appendChild(document.createElement("br"));
	}

}
