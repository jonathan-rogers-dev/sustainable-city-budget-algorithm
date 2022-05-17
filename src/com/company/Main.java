package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // Groups group = new Groups();
        /*
        File file = new File("write.txt");


         */

        System.out.println("Magic is happening, but it takes time...");
        System.out.println("Please wait...");
        Groups group = new Groups();

        for (int a = 0; a <= 2; a++) {
            group.energyNuclear(a);
            if (group.checkArea() == false) {
                group.reset();
                break;
            }
            for (int b = 0; b <= 3; b++) {
                group.energyCoal(b);
                if (group.checkArea() == false) {
                    group.reset();
                    break;
                }
                for (int c = 0; c <= 6; c++) {
                    group.energyGas(c);
                    if (group.checkArea() == false) {
                        group.reset();
                        break;
                    }
                    for (int d = 0; d <= 34; d++) {
                        group.energyWind(d);
                        if (group.checkArea() == false) {
                            group.reset();
                            break;
                        }
                        for (int e = 0; e <= 20; d++) {
                            group.energySolar(e);
                            if (group.checkArea() == false) {
                                group.reset();
                                break;
                            }
                            for (int f = 0; f <= 0; f++) {
                                group.energyHydro(f);
                                if (group.checkArea() == false) {
                                    group.reset();
                                    break;
                                }
                                for (int g = 0; g <= 5; g++) {
                                    group.energyGeothermal(g);
                                    if (group.checkArea() == false) {
                                        group.reset();
                                        break;
                                    }
                                    for (int h = 0; h <= 0; h++) {
                                        group.energyTidal(h);
                                        if (group.checkArea() == false || group.checkEnergy() == false) {
                                            group.reset();
                                            break;
                                        }
                                        for (int i = 0; i <= 0; i++) {
                                            group.calcFoodFarmedMeat();
                                            if (group.checkArea() == false) {
                                                group.reset();
                                                break;
                                            }
                                            for (int j = 0; j <= 2; j++) {
                                                group.calcFoodMonoculture();
                                                if (group.checkArea() == false) {
                                                    group.reset();
                                                    break;
                                                }
                                                for (int k = 0; k <= 4; k++) {
                                                    group.calcFoodRangeImported();
                                                    if (group.checkArea() == false) {
                                                        group.reset();
                                                        break;
                                                    }
                                                    for (int l = 0; l <= 8; l++) {
                                                        group.calcFoodRangeLocal();
                                                        if (group.checkArea() == false || group.checkFood() == false) {
                                                            group.reset();
                                                            break;
                                                        }
                                                        for (int m = 0; m <= 2; m++) {
                                                            group.employmentHeavy();
                                                            if (group.checkArea() == false) {
                                                                group.reset();
                                                                break;
                                                            }
                                                            for (int n = 0; n <= 2; n++) {
                                                                group.employmentLight();
                                                                if (group.checkArea() == false) {
                                                                    group.reset();
                                                                    break;
                                                                }
                                                                for (int o = 0; o <= 3; o++) {
                                                                    group.employmentCommercial();
                                                                    if (group.checkArea() == false) {
                                                                        group.reset();
                                                                        break;
                                                                    }
                                                                    for (int p = 0; p <= 0; p++) {
                                                                        group.employmentUnemployed();
                                                                        if (group.checkArea() == false || group.checkEmployment() == false) {
                                                                            group.reset();
                                                                            break;
                                                                        }
                                                                        for (int q = 0; q <= 3; q++) {
                                                                            group.housingHigh(q);
                                                                            if (group.checkArea() == false) {
                                                                                group.reset();
                                                                                break;
                                                                            }
                                                                            for (int r = 0; r <= 4; r++) {
                                                                                group.housingMedium(r);
                                                                                if (group.checkArea() == false) {
                                                                                    group.reset();
                                                                                    break;
                                                                                }
                                                                                for (int s = 0; s <= 8; s++) {
                                                                                    group.housingLow(s);
                                                                                    if (group.checkArea() == false) {
                                                                                        group.reset();
                                                                                        break;
                                                                                    }
                                                                                    for (int t = 0; t <= 0; t++) {
                                                                                        group.housingHomeless(t);
                                                                                        if (group.checkArea() == false || group.checkHousing() == false) {
                                                                                            group.reset();
                                                                                            break;
                                                                                        }
                                                                                        for (int u = 0; u <= 2; u++) {
                                                                                            group.wasteLandfill(u);
                                                                                            if (group.checkArea() == false) {
                                                                                                group.reset();
                                                                                                break;
                                                                                            }
                                                                                            for (int v = 0; v <= 4; v++) {
                                                                                                group.wasteWeeklyTrash(v);
                                                                                                if (group.checkArea() == false) {
                                                                                                    group.reset();
                                                                                                    break;
                                                                                                }
                                                                                                for (int x = 0; x <= 8; x++) {
                                                                                                    group.wasteRecyclingPickup(x);
                                                                                                    if (group.checkArea() == false) {
                                                                                                        group.reset();
                                                                                                        break;
                                                                                                    }
                                                                                                    for (int y = 0; y <= 6; y++) {
                                                                                                        group.wasteCompost(y);
                                                                                                        if (group.checkArea() == false) {
                                                                                                            group.reset();
                                                                                                            break;
                                                                                                        }
                                                                                                        for (int z = 0; z <= 3; z++) {
                                                                                                            group.wasteHazardous(z);
                                                                                                            if (group.checkArea() == false || group.checkWaste() == false) {
                                                                                                                group.reset();
                                                                                                                break;
                                                                                                            }
                                                                                                            for (int aa = 0; aa <= 0; aa++) {
                                                                                                                group.airport();
                                                                                                                if (group.checkArea() == false) {
                                                                                                                    group.reset();
                                                                                                                    break;
                                                                                                                }
                                                                                                                for (int ab = 0; ab <= 0; ab++) {
                                                                                                                    group.prison();
                                                                                                                    if (group.checkArea() == false) {
                                                                                                                        group.reset();
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    for (int ac = 0; ac <= 0; ac++) {
                                                                                                                        group.toxicWasteDump();
                                                                                                                        if (group.checkArea() == false) {
                                                                                                                            group.reset();
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        for (int ad = 0; ad <= 1; ad++) {
                                                                                                                            group.toxicWasteDump();
                                                                                                                            if (group.checkArea() == false) {
                                                                                                                                group.reset();
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            for (int ae = 0; ae <= 1; ae++) {
                                                                                                                                group.fracking();
                                                                                                                                if (group.checkArea() == false) {
                                                                                                                                    group.reset();
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                for (int af = 0; af <= 0; af++) {
                                                                                                                                    group.cemetery();
                                                                                                                                    if (group.checkArea() == false) {
                                                                                                                                        group.reset();
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    for (int ag = 0; ag <= 1; ag++) {
                                                                                                                                        group.bikesForRent();
                                                                                                                                        if (group.checkArea() == false) {
                                                                                                                                            group.reset();
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        for (int ai = 0; ai <= 1; ai++) {
                                                                                                                                            group.bus();
                                                                                                                                            if (group.checkArea() == false) {
                                                                                                                                                group.reset();
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            for (int aj = 0; aj <= 1; aj++) {
                                                                                                                                                group.carpoolPlusParking();
                                                                                                                                                if (group.checkArea() == false) {
                                                                                                                                                    group.reset();
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                for (int ak = 0; ak <= 1; ak++) {
                                                                                                                                                    group.lightrail();
                                                                                                                                                    if (group.checkArea() == false) {
                                                                                                                                                        group.reset();
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    for (int al = 0; al <= 1; al++) {
                                                                                                                                                        group.park();
                                                                                                                                                        if (group.checkArea() == false) {
                                                                                                                                                            group.reset();
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        for (int am = 0; am <= 1; am++) {
                                                                                                                                                            group.poolAndRec();
                                                                                                                                                            if (group.checkArea() == false) {
                                                                                                                                                                group.reset();
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            for (int an = 0; an <= 1; an++) {
                                                                                                                                                                group.publicArt();
                                                                                                                                                                if (group.checkArea() == false) {
                                                                                                                                                                    group.reset();
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                for (int ao = 0; ao <= 1; ao++) {
                                                                                                                                                                    group.trails();
                                                                                                                                                                    if (group.checkArea() == false) {
                                                                                                                                                                        group.reset();
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    for (int ap = 0; ap <= 1; ap++) {
                                                                                                                                                                        group.aquarium();
                                                                                                                                                                        if (group.checkArea() == false) {
                                                                                                                                                                            group.reset();
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        for (int aq = 0; aq <= 1; aq++) {
                                                                                                                                                                            group.lake();
                                                                                                                                                                            if (group.checkArea() == false) {
                                                                                                                                                                                group.reset();
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            for (int ar = 0; ar <= 1; ar++) {
                                                                                                                                                                                group.college();
                                                                                                                                                                                if (group.checkArea() == false) {
                                                                                                                                                                                    group.reset();
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                String contents = group.getResults()[0] + "\t" + group.getResults()[1] + "\t" + group.getResults()[2] + "\t" + group.getResults()[3] + "\t" + group.getResults()[4] + "\t" + group.getResults()[5] + "\t" + group.getResults()[6] + "\t" + group.getResults()[7] + "\t" + group.getResults()[8] + "\n" +  a + "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f + "\t" + g + "\t" + h + "\t" + i + "\t" + j + "\t" + k + "\t" + l + "\t" + m + "\t" + n + "\t" + o + "\t" + p + "\t" + q + "\t" + r + "\t" + s + "\t" + t + "\t" + u + "\t" + v + "\t" + "\t" + x + "\t" + y + "\t" + z + "\t" + aa + "\t" + ab + "\t" + ac + "\t" + ad + "\t" + ae + "\t" + af + "\t" + ag + "\t" + "\t" + ai + "\t" + aj + "\t" + ak + "\t" + al + "\t" + am + "\t" + an + "\t" + ao + "\t" + ap + "\t" + aq + "\t" + ar;
                                                                                                                                                                                System.out.println(contents);

                                                                                                                                                                                        /*
                                                                                                                                                                                        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
                                                                                                                                                                                            //String contents = group.getResults()[0] + "\n" + group.getResults()[1] + "\n" + group.getResults()[2] + "\n" + group.getResults()[3] + "\n" + group.getResults()[4] + "\n" + group.getResults()[5] + "\n" + group.getResults()[6] + "\n" + group.getResults()[7] + "\n" + group.getResults()[8];
                                                                                                                                                                                            writer.write(contents);
                                                                                                                                                                                            //System.out.println(contents);
                                                                                                                                                                                        } catch (IOException exception) {
                                                                                                                                                                                            exception.printStackTrace();
                                                                                                                                                                                        }

                                                                                                                                                                                         */
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}