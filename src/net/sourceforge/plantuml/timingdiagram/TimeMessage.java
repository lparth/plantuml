/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2017, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 *
 */
package net.sourceforge.plantuml.timingdiagram;

import net.sourceforge.plantuml.cucadiagram.Display;

public class TimeMessage {

	private final TickInPlayer tickInPlayer1;
	private final TickInPlayer tickInPlayer2;
	private final Display label;

	public TimeMessage(TickInPlayer tickInPlayer1, TickInPlayer tickInPlayer2, String label) {
		this.tickInPlayer1 = tickInPlayer1;
		this.tickInPlayer2 = tickInPlayer2;
		this.label = Display.getWithNewlines(label);
	}

	public final Player getPlayer1() {
		return tickInPlayer1.getPlayer();
	}

	public final Player getPlayer2() {
		return tickInPlayer2.getPlayer();
	}

	public final TimeTick getTick1() {
		return tickInPlayer1.getTick();
	}

	public final TimeTick getTick2() {
		return tickInPlayer2.getTick();
	}

	public final Display getLabel() {
		return label;
	}

}
