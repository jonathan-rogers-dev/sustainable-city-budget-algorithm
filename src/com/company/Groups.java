package com.company;

public class Groups {
    // Instance Vars
    private int credits = 1000;
    private int area = 1688;
    private int pollution = 0;
    private int happiness = 0;
    private int energyServed = 0;
    private int foodServed = 0;
    private int employmentServed = 0;
    private int housingServed = 0;
    private int wasteServed = 0;

    public Groups() { // TODO: Add additional roads and bridges
        credits -= 500;
        area -= 800;
        pollution += 75;
        happiness = 0;
    }

    public void reset() {
        credits = 1000;
        area = 1688;
        pollution = 0;
        happiness = 0;
        foodServed = 0;
        employmentServed = 0;
        housingServed = 0;
        wasteServed = 0;

        credits -= 500;
        area -= 880;
        pollution += 75;
        happiness = 0;
    }

    // Energy

    public void energyNuclear(int i) {
        credits -= 500 * i;
        area -= 50 * i;
        pollution += 10 * i;
        happiness -= 15 * i;
        energyServed = 28000 * i;
    }
    public void energyCoal(int i) {
        credits -= 10 * i;
        area -= 50 * i;
        pollution += 50 * i;
        happiness -= 15 * i;
        energyServed = 28000 * i;
    }
    public void energyGas(int i) {
        credits -= 25 * i;
        area -= 45 * i;
        pollution += 20 * i;
        happiness -= 5 * i;
        energyServed = 9000 * i;
    }
    public void energyWind(int i) {
        credits -= 75 * i;
        area -= 35 * i;
        pollution -= 5 * i;
        happiness += 5 * i;
        energyServed = 1500 * i;
    }
    public void energySolar(int i) {
        credits -= 150 * i;
        area -= 25 * i;
        pollution -= 10 * i;
        happiness += 10 * i;
        energyServed = 2500 * i;
    }
    public void energyGeothermal(int i) {
        credits -= 200 * i;
        area -= 40 * i;
        pollution -= 5 * i;
        happiness += 15 * i;
        energyServed = 11000 * i;
    }
    public void energyHydro(int i) {
        credits -= 250 * i;
        area -= 25 * i;
        pollution -= 10 * i;
        happiness += 20 * i;
        energyServed = 6500 * i;
    }
    public void energyTidal(int i) {
        credits -= 300 * i;
        area -= 20 * i;
        pollution -= 15 * i;
        happiness += 25 * i;
        energyServed = 3500 * i;
    }

    // Food

    public void calcFoodFarmedMeat() {
        credits -= 100;
        area -= 75;
        pollution += 65;
        happiness -= 30;
        foodServed += 23000;
    }
    public void calcFoodMonoculture() {
        credits -= 100;
        area -= 60;
        pollution += 45;
        happiness -= 20;
        foodServed += 36000;
    }
    public void calcFoodRangeImported() {
        credits -= 200;
        area -= 35;
        pollution += 20;
        happiness += 20;
        foodServed += 16000;
    }
    public void calcFoodRangeLocal() {
        credits -= 350;
        area -= 50;
        pollution += 10;
        happiness += 45;
        foodServed += 7000;
    }

    // Employment

    public void employmentHeavy() {
        credits += 250;
        area -= 100;
        pollution += 50;
        happiness -= 15;
        employmentServed += 28000;
    }
    public void employmentLight() {
        credits += 175;
        area -= 85;
        pollution += 30;
        happiness -= 10;
        employmentServed += 24000;
    }
    public void employmentCommercial() {
        credits += 100;
        area -= 75;
        pollution += 25;
        happiness -= 5;
        employmentServed += 22000;
    }
    public void employmentUnemployed() {
        credits -= 25;
        area -= 10;
        pollution -= 10;
        happiness -= 20;
        employmentServed += 1000;
    }

    // Housing

    public void housingHigh(int i) {
        credits += 150 * i;
        area -= 200 * i;
        pollution += 10 * i;
        happiness += 20 * i;
        housingServed += 19000 * i;
    }
    public void housingMedium(int i) {
        credits += 250 * i;
        area -= 175 * i;
        pollution += 30 * i;
        happiness += 30 * i;
        housingServed += 13000 * i;
    }
    public void housingLow(int i) {
        credits += 400 * i;
        area -= 12 * i;
        pollution += 50 * i;
        happiness += 40 * i;
        housingServed += 7000 * i;
    }
    public void housingHomeless(int i) {
        credits -= 10 * i;
        area -= 5 * i;
        pollution -= 10 * i;
        happiness -= 20 * i;
        housingServed += 1000 * i;
    }

    // Waste

    public void wasteLandfill(int i) {
        credits -= 100 * i;
        area -= 50 * i;
        pollution += 20 * i;
        wasteServed += 25000 * i;
        happiness -= 30 * i;
    }
    public void wasteWeeklyTrash(int i) {
        credits -= 40 * i;
        area -= 25 * i;
        pollution += 50 * i;
        wasteServed += 15000 * i;
        happiness += 10 * i;
    }
    public void wasteRecyclingPickup(int i) {
        credits -= 35 * i;
        area -= 15 * i;
        pollution -= 10 * i;
        wasteServed += 7000 * i;
        happiness += 20 * i;
    }
    public void wasteCompost(int i) {
        credits -= 50 * i;
        area -= 15 * i;
        pollution -= 15 * i;
        wasteServed += 9500 * i;
        happiness += 25 * i;
    }
    public void wasteHazardous(int i) {
        credits -= 75 * i;
        area -= 20 * i;
        pollution -= 25 * i;
        wasteServed += 18000 * i;
        happiness += 35 * i;
    }

    // Undesirables

    public void airport() {
        credits -= 200;
        area -= 200;
        pollution -= 50;
        happiness -= 50;
    }
    public void prison() {
        credits -= 500;
        area -= 125;
        pollution -= 60;
        happiness -= 75;
    }
    public void toxicWasteDump() {
        credits -= 700;
        area -= 150;
        pollution -= 125;
        happiness -= 100;
    }
    public void fracking() {
        credits -= 300;
        area -= 100;
        pollution -= 100;
        happiness -= 60;
    }
    public void cemetery() {
        credits -= 75;
        area -= 50;
        pollution -= 5;
        happiness -= 10;
    }

    // Transportation

    public void bikesForRent() {
        credits -= 30;
        area -= 30;
        pollution += 5;
        happiness += 10;
    }
    public void bus() {
        credits -= 50;
        area -= 60;
        pollution += 20;
        happiness += 20;
    }
    public void carpoolPlusParking() {
        credits -= 100;
        area -= 40;
        pollution += 15;
        happiness += 25;
    }
    public void lightrail() {
        credits -= 300;
        area -= 70;
        pollution += 35;
        happiness += 25;
    }

    // Perks

    public void park() {
        credits -= 150;
        area -= 30;
        pollution += 10;
        happiness += 30;
    }
    public void poolAndRec() {
        credits -= 100;
        area -= 50;
        pollution -= 5;
        happiness += 50;
    }
    public void publicArt() {
        credits -= 50;
        area -= 15;
        pollution -= 1;
        happiness += 25;
    }
    public void trails() {
        credits -= 50;
        area -= 75;
        pollution += 5;
        happiness += 50;
    }
    public void aquarium() {
        credits -= 200;
        area -= 80;
        pollution -= 5;
        happiness += 60;
    }
    public void lake() {
        credits -= 250;
        area -= 100;
        pollution += 15;
        happiness += 40;
    }
    public void college() {
        credits -= 150;
        area -= 75;
        pollution -= 10;
        happiness += 25;
    }

    public int[] getResults() {
        int[] returnArray = {credits, area, pollution, wasteServed, employmentServed, energyServed, foodServed, housingServed, happiness};
        return returnArray;
    }

    // Checks

    public boolean checkArea() {
        if (area < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkWaste() {
        if (wasteServed < 50000) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkEnergy() {
        if (energyServed < 50000) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkFood() {
        if (foodServed < 50000) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkHousing() {
        if (housingServed < 50000) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkEmployment() {
        if (employmentServed < 50000) {
            return false;
        } else {
            return true;
        }
    }
}
