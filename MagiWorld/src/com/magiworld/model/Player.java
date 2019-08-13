package com.magiworld.model;

/**
 * @author Noureddine
 * 
 * This abstract Class defines all the global characteristics of the Players
 *
 */
public abstract class Player {

	private double level;
	private double health;
	private double strength;
	private double agility;
	private double intelligence;
	
	/**
	 * Basic attack of the player
	 * @return the power of the attack
	 */
	public abstract double basicAttack();

	/**
	 * Special attack of the player
	 * @return the power of the attack
	 */
	public abstract double specialAttack();

	
	
}
