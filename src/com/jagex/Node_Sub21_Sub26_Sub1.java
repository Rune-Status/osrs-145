package com.jagex;

public class Node_Sub21_Sub26_Sub1 extends DrawingArea {
    public static boolean aBoolean1084 = true;
    public static int[] COS = new int[2048];
    public static int anInt228 = 512;
    public static TextureProvider aTextureProvider1085;
    public static int[] anIntArray240 = new int[65536];
    public static int[] SINE = new int[2048];
    static int anInt327 = 0;
    static boolean aBoolean324 = false;
    static boolean aBoolean316 = false;
    static int[] anIntArray1081 = new int[512];
    static int anInt919;
    static int viewportCenterX;
    static int viewportCenterY;
    static int anInt229;
    static int anInt230;
    static int anInt222;
    static int anInt235;
    static int anInt981;
    static int[] anIntArray1082 = new int[1024];
    static boolean aBoolean1083 = false;
    static int[] anIntArray661 = new int[2048];

    static {
        int var0;
        for (var0 = 1; var0 < 512; ++var0) {
            anIntArray1081[var0] = '耀' / var0;
        }

        for (var0 = 1; var0 < 2048; ++var0) {
            anIntArray661[var0] = 65536 / var0;
        }

        for (var0 = 0; var0 < 2048; ++var0) {
            SINE[var0] = (int) (65536.0D * Math.sin((double) var0 * 0.0030679615D));
            COS[var0] = (int) (65536.0D * Math.cos((double) var0 * 0.0030679615D));
        }

    }

    public static void method308() {
        method635(areaLeft, areaTop, areaRight, areaBottom);
    }

    static void method632(double var0, int var2, int var3) {
        int var4 = var2 * 128;

        for (int var5 = var2; var5 < var3; ++var5) {
            double var6 = (double) (var5 >> 3) / 64.0D + 0.0078125D;
            double var8 = (double) (var5 & 7) / 8.0D + 0.0625D;

            for (int var10 = 0; var10 < 128; ++var10) {
                double var11 = (double) var10 / 128.0D;
                double var13 = var11;
                double var15 = var11;
                double var17 = var11;
                if (var8 != 0.0D) {
                    double var19;
                    if (var11 < 0.5D) {
                        var19 = var11 * (1.0D + var8);
                    } else {
                        var19 = var11 + var8 - var11 * var8;
                    }

                    double var21 = 2.0D * var11 - var19;
                    double var23 = var6 + 0.3333333333333333D;
                    if (var23 > 1.0D) {
                        --var23;
                    }

                    double var27 = var6 - 0.3333333333333333D;
                    if (var27 < 0.0D) {
                        ++var27;
                    }

                    if (6.0D * var23 < 1.0D) {
                        var13 = var21 + (var19 - var21) * 6.0D * var23;
                    } else if (2.0D * var23 < 1.0D) {
                        var13 = var19;
                    } else if (3.0D * var23 < 2.0D) {
                        var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
                    } else {
                        var13 = var21;
                    }

                    if (6.0D * var6 < 1.0D) {
                        var15 = var21 + (var19 - var21) * 6.0D * var6;
                    } else if (2.0D * var6 < 1.0D) {
                        var15 = var19;
                    } else if (3.0D * var6 < 2.0D) {
                        var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
                    } else {
                        var15 = var21;
                    }

                    if (6.0D * var27 < 1.0D) {
                        var17 = var21 + (var19 - var21) * 6.0D * var27;
                    } else if (2.0D * var27 < 1.0D) {
                        var17 = var19;
                    } else if (3.0D * var27 < 2.0D) {
                        var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
                    } else {
                        var17 = var21;
                    }
                }

                int var29 = (int) (var13 * 256.0D);
                int var30 = (int) (var15 * 256.0D);
                int var31 = (int) (var17 * 256.0D);
                int var32 = (var29 << 16) + (var30 << 8) + var31;
                var32 = method629(var32, var0);
                if (var32 == 0) {
                    var32 = 1;
                }

                anIntArray240[var4++] = var32;
            }
        }

    }

    public static void method645(TextureProvider var0) {
        aTextureProvider1085 = var0;
    }

    public static void method648(double var0) {
        method632(var0, 0, 512);
    }

    static int method629(int var0, double var1) {
        double var3 = (double) (var0 >> 16) / 256.0D;
        double var5 = (double) (var0 >> 8 & 255) / 256.0D;
        double var7 = (double) (var0 & 255) / 256.0D;
        var3 = Math.pow(var3, var1);
        var5 = Math.pow(var5, var1);
        var7 = Math.pow(var7, var1);
        int var9 = (int) (var3 * 256.0D);
        int var10 = (int) (var5 * 256.0D);
        int var11 = (int) (var7 * 256.0D);
        return (var9 << 16) + (var10 << 8) + var11;
    }

    static void method638(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = var4 - var3;
        int var10 = var1 - var0;
        int var11 = var5 - var3;
        int var12 = var2 - var0;
        int var13 = var7 - var6;
        int var14 = var8 - var6;
        int var15;
        if (var2 != var1) {
            var15 = (var5 - var4 << 14) / (var2 - var1);
        } else {
            var15 = 0;
        }

        int var16;
        if (var1 != var0) {
            var16 = (var9 << 14) / var10;
        } else {
            var16 = 0;
        }

        int var17;
        if (var2 != var0) {
            var17 = (var11 << 14) / var12;
        } else {
            var17 = 0;
        }

        int var18 = var9 * var12 - var11 * var10;
        if (var18 != 0) {
            int var19 = (var13 * var12 - var14 * var10 << 8) / var18;
            int var20 = (var14 * var9 - var13 * var11 << 8) / var18;
            if (var0 <= var1 && var0 <= var2) {
                if (var0 < anInt235) {
                    if (var1 > anInt235) {
                        var1 = anInt235;
                    }

                    if (var2 > anInt235) {
                        var2 = anInt235;
                    }

                    var6 = (var6 << 8) - var19 * var3 + var19;
                    if (var1 < var2) {
                        var5 = var3 <<= 14;
                        if (var0 < 0) {
                            var5 -= var17 * var0;
                            var3 -= var16 * var0;
                            var6 -= var20 * var0;
                            var0 = 0;
                        }

                        var4 <<= 14;
                        if (var1 < 0) {
                            var4 -= var15 * var1;
                            var1 = 0;
                        }

                        if ((var0 == var1 || var17 >= var16) && (var0 != var1 || var17 <= var15)) {
                            var2 -= var1;
                            var1 -= var0;
                            var0 = anIntArray1082[var0];

                            while (true) {
                                --var1;
                                if (var1 < 0) {
                                    while (true) {
                                        --var2;
                                        if (var2 < 0) {
                                            return;
                                        }

                                        method636(buffer, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19);
                                        var5 += var17;
                                        var4 += var15;
                                        var6 += var20;
                                        var0 += areaWidth;
                                    }
                                }

                                method636(buffer, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
                                var5 += var17;
                                var3 += var16;
                                var6 += var20;
                                var0 += areaWidth;
                            }
                        }
                        var2 -= var1;
                        var1 -= var0;
                        var0 = anIntArray1082[var0];

                        while (true) {
                            --var1;
                            if (var1 < 0) {
                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        return;
                                    }

                                    method636(buffer, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19);
                                    var5 += var17;
                                    var4 += var15;
                                    var6 += var20;
                                    var0 += areaWidth;
                                }
                            }

                            method636(buffer, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
                            var5 += var17;
                            var3 += var16;
                            var6 += var20;
                            var0 += areaWidth;
                        }
                    }
                    var4 = var3 <<= 14;
                    if (var0 < 0) {
                        var4 -= var17 * var0;
                        var3 -= var16 * var0;
                        var6 -= var20 * var0;
                        var0 = 0;
                    }

                    var5 <<= 14;
                    if (var2 < 0) {
                        var5 -= var15 * var2;
                        var2 = 0;
                    }

                    if (var0 != var2 && var17 < var16 || var0 == var2 && var15 > var16) {
                        var1 -= var2;
                        var2 -= var0;
                        var0 = anIntArray1082[var0];

                        while (true) {
                            --var2;
                            if (var2 < 0) {
                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        return;
                                    }

                                    method636(buffer, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
                                    var5 += var15;
                                    var3 += var16;
                                    var6 += var20;
                                    var0 += areaWidth;
                                }
                            }

                            method636(buffer, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19);
                            var4 += var17;
                            var3 += var16;
                            var6 += var20;
                            var0 += areaWidth;
                        }
                    }
                    var1 -= var2;
                    var2 -= var0;
                    var0 = anIntArray1082[var0];

                    while (true) {
                        --var2;
                        if (var2 < 0) {
                            while (true) {
                                --var1;
                                if (var1 < 0) {
                                    return;
                                }

                                method636(buffer, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
                                var5 += var15;
                                var3 += var16;
                                var6 += var20;
                                var0 += areaWidth;
                            }
                        }

                        method636(buffer, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19);
                        var4 += var17;
                        var3 += var16;
                        var6 += var20;
                        var0 += areaWidth;
                    }
                }
            } else if (var1 <= var2) {
                if (var1 < anInt235) {
                    if (var2 > anInt235) {
                        var2 = anInt235;
                    }

                    if (var0 > anInt235) {
                        var0 = anInt235;
                    }

                    var7 = (var7 << 8) - var19 * var4 + var19;
                    if (var2 < var0) {
                        var3 = var4 <<= 14;
                        if (var1 < 0) {
                            var3 -= var16 * var1;
                            var4 -= var15 * var1;
                            var7 -= var20 * var1;
                            var1 = 0;
                        }

                        var5 <<= 14;
                        if (var2 < 0) {
                            var5 -= var17 * var2;
                            var2 = 0;
                        }

                        if ((var1 == var2 || var16 >= var15) && (var1 != var2 || var16 <= var17)) {
                            var0 -= var2;
                            var2 -= var1;
                            var1 = anIntArray1082[var1];

                            while (true) {
                                --var2;
                                if (var2 < 0) {
                                    while (true) {
                                        --var0;
                                        if (var0 < 0) {
                                            return;
                                        }

                                        method636(buffer, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19);
                                        var3 += var16;
                                        var5 += var17;
                                        var7 += var20;
                                        var1 += areaWidth;
                                    }
                                }

                                method636(buffer, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
                                var3 += var16;
                                var4 += var15;
                                var7 += var20;
                                var1 += areaWidth;
                            }
                        }
                        var0 -= var2;
                        var2 -= var1;
                        var1 = anIntArray1082[var1];

                        while (true) {
                            --var2;
                            if (var2 < 0) {
                                while (true) {
                                    --var0;
                                    if (var0 < 0) {
                                        return;
                                    }

                                    method636(buffer, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19);
                                    var3 += var16;
                                    var5 += var17;
                                    var7 += var20;
                                    var1 += areaWidth;
                                }
                            }

                            method636(buffer, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
                            var3 += var16;
                            var4 += var15;
                            var7 += var20;
                            var1 += areaWidth;
                        }
                    }
                    var5 = var4 <<= 14;
                    if (var1 < 0) {
                        var5 -= var16 * var1;
                        var4 -= var15 * var1;
                        var7 -= var20 * var1;
                        var1 = 0;
                    }

                    var3 <<= 14;
                    if (var0 < 0) {
                        var3 -= var17 * var0;
                        var0 = 0;
                    }

                    if (var16 < var15) {
                        var2 -= var0;
                        var0 -= var1;
                        var1 = anIntArray1082[var1];

                        while (true) {
                            --var0;
                            if (var0 < 0) {
                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        return;
                                    }

                                    method636(buffer, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
                                    var3 += var17;
                                    var4 += var15;
                                    var7 += var20;
                                    var1 += areaWidth;
                                }
                            }

                            method636(buffer, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19);
                            var5 += var16;
                            var4 += var15;
                            var7 += var20;
                            var1 += areaWidth;
                        }
                    }
                    var2 -= var0;
                    var0 -= var1;
                    var1 = anIntArray1082[var1];

                    while (true) {
                        --var0;
                        if (var0 < 0) {
                            while (true) {
                                --var2;
                                if (var2 < 0) {
                                    return;
                                }

                                method636(buffer, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
                                var3 += var17;
                                var4 += var15;
                                var7 += var20;
                                var1 += areaWidth;
                            }
                        }

                        method636(buffer, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19);
                        var5 += var16;
                        var4 += var15;
                        var7 += var20;
                        var1 += areaWidth;
                    }
                }
            } else if (var2 < anInt235) {
                if (var0 > anInt235) {
                    var0 = anInt235;
                }

                if (var1 > anInt235) {
                    var1 = anInt235;
                }

                var8 = (var8 << 8) - var19 * var5 + var19;
                if (var0 < var1) {
                    var4 = var5 <<= 14;
                    if (var2 < 0) {
                        var4 -= var15 * var2;
                        var5 -= var17 * var2;
                        var8 -= var20 * var2;
                        var2 = 0;
                    }

                    var3 <<= 14;
                    if (var0 < 0) {
                        var3 -= var16 * var0;
                        var0 = 0;
                    }

                    if (var15 < var17) {
                        var1 -= var0;
                        var0 -= var2;
                        var2 = anIntArray1082[var2];

                        while (true) {
                            --var0;
                            if (var0 < 0) {
                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        return;
                                    }

                                    method636(buffer, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19);
                                    var4 += var15;
                                    var3 += var16;
                                    var8 += var20;
                                    var2 += areaWidth;
                                }
                            }

                            method636(buffer, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
                            var4 += var15;
                            var5 += var17;
                            var8 += var20;
                            var2 += areaWidth;
                        }
                    }
                    var1 -= var0;
                    var0 -= var2;
                    var2 = anIntArray1082[var2];

                    while (true) {
                        --var0;
                        if (var0 < 0) {
                            while (true) {
                                --var1;
                                if (var1 < 0) {
                                    return;
                                }

                                method636(buffer, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19);
                                var4 += var15;
                                var3 += var16;
                                var8 += var20;
                                var2 += areaWidth;
                            }
                        }

                        method636(buffer, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
                        var4 += var15;
                        var5 += var17;
                        var8 += var20;
                        var2 += areaWidth;
                    }
                }
                var3 = var5 <<= 14;
                if (var2 < 0) {
                    var3 -= var15 * var2;
                    var5 -= var17 * var2;
                    var8 -= var20 * var2;
                    var2 = 0;
                }

                var4 <<= 14;
                if (var1 < 0) {
                    var4 -= var16 * var1;
                    var1 = 0;
                }

                if (var15 < var17) {
                    var0 -= var1;
                    var1 -= var2;
                    var2 = anIntArray1082[var2];

                    while (true) {
                        --var1;
                        if (var1 < 0) {
                            while (true) {
                                --var0;
                                if (var0 < 0) {
                                    return;
                                }

                                method636(buffer, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
                                var4 += var16;
                                var5 += var17;
                                var8 += var20;
                                var2 += areaWidth;
                            }
                        }

                        method636(buffer, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19);
                        var3 += var15;
                        var5 += var17;
                        var8 += var20;
                        var2 += areaWidth;
                    }
                }
                var0 -= var1;
                var1 -= var2;
                var2 = anIntArray1082[var2];

                while (true) {
                    --var1;
                    if (var1 < 0) {
                        while (true) {
                            --var0;
                            if (var0 < 0) {
                                return;
                            }

                            method636(buffer, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
                            var4 += var16;
                            var5 += var17;
                            var8 += var20;
                            var2 += areaWidth;
                        }
                    }

                    method636(buffer, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19);
                    var3 += var15;
                    var5 += var17;
                    var8 += var20;
                    var2 += areaWidth;
                }
            }
        }
    }

    static void method644(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
        int[] var19 = aTextureProvider1085.getPixels(var18);
        int var20;
        if (var19 == null) {
            var20 = aTextureProvider1085.method501(var18);
            method638(var0, var1, var2, var3, var4, var5, method634(var20, var6), method634(var20, var7), method634(var20, var8));
        } else {
            aBoolean316 = aTextureProvider1085.method503(var18);
            aBoolean324 = aTextureProvider1085.method500(var18);
            var20 = var4 - var3;
            int var21 = var1 - var0;
            int var22 = var5 - var3;
            int var23 = var2 - var0;
            int var24 = var7 - var6;
            int var25 = var8 - var6;
            int var26 = 0;
            if (var1 != var0) {
                var26 = (var4 - var3 << 14) / (var1 - var0);
            }

            int var27 = 0;
            if (var2 != var1) {
                var27 = (var5 - var4 << 14) / (var2 - var1);
            }

            int var28 = 0;
            if (var2 != var0) {
                var28 = (var3 - var5 << 14) / (var0 - var2);
            }

            int var29 = var20 * var23 - var22 * var21;
            if (var29 != 0) {
                int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
                int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
                var10 = var9 - var10;
                var13 = var12 - var13;
                var16 = var15 - var16;
                var11 -= var9;
                var14 -= var12;
                var17 -= var15;
                int var32 = var11 * var12 - var14 * var9 << 14;
                int var33 = (int) (((long) (var14 * var15 - var17 * var12) << 3 << 14) / (long) anInt228);
                int var34 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / (long) anInt228);
                int var35 = var10 * var12 - var13 * var9 << 14;
                int var36 = (int) (((long) (var13 * var15 - var16 * var12) << 3 << 14) / (long) anInt228);
                int var37 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / (long) anInt228);
                int var38 = var13 * var11 - var10 * var14 << 14;
                int var39 = (int) (((long) (var16 * var14 - var13 * var17) << 3 << 14) / (long) anInt228);
                int var40 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / (long) anInt228);
                int var41;
                if (var0 <= var1 && var0 <= var2) {
                    if (var0 < anInt235) {
                        if (var1 > anInt235) {
                            var1 = anInt235;
                        }

                        if (var2 > anInt235) {
                            var2 = anInt235;
                        }

                        var6 = (var6 << 9) - var30 * var3 + var30;
                        if (var1 < var2) {
                            var5 = var3 <<= 14;
                            if (var0 < 0) {
                                var5 -= var28 * var0;
                                var3 -= var26 * var0;
                                var6 -= var31 * var0;
                                var0 = 0;
                            }

                            var4 <<= 14;
                            if (var1 < 0) {
                                var4 -= var27 * var1;
                                var1 = 0;
                            }

                            var41 = var0 - viewportCenterY;
                            var32 += var34 * var41;
                            var35 += var37 * var41;
                            var38 += var40 * var41;
                            if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
                                var2 -= var1;
                                var1 -= var0;
                                var0 = anIntArray1082[var0];

                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        while (true) {
                                            --var2;
                                            if (var2 < 0) {
                                                return;
                                            }

                                            method640(buffer, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                            var5 += var28;
                                            var4 += var27;
                                            var6 += var31;
                                            var0 += areaWidth;
                                            var32 += var34;
                                            var35 += var37;
                                            var38 += var40;
                                        }
                                    }

                                    method640(buffer, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                    var5 += var28;
                                    var3 += var26;
                                    var6 += var31;
                                    var0 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }
                            var2 -= var1;
                            var1 -= var0;
                            var0 = anIntArray1082[var0];

                            while (true) {
                                --var1;
                                if (var1 < 0) {
                                    while (true) {
                                        --var2;
                                        if (var2 < 0) {
                                            return;
                                        }

                                        method640(buffer, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                        var5 += var28;
                                        var4 += var27;
                                        var6 += var31;
                                        var0 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method640(buffer, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                var5 += var28;
                                var3 += var26;
                                var6 += var31;
                                var0 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var4 = var3 <<= 14;
                        if (var0 < 0) {
                            var4 -= var28 * var0;
                            var3 -= var26 * var0;
                            var6 -= var31 * var0;
                            var0 = 0;
                        }

                        var5 <<= 14;
                        if (var2 < 0) {
                            var5 -= var27 * var2;
                            var2 = 0;
                        }

                        var41 = var0 - viewportCenterY;
                        var32 += var34 * var41;
                        var35 += var37 * var41;
                        var38 += var40 * var41;
                        if (var0 != var2 && var28 < var26 || var0 == var2 && var27 > var26) {
                            var1 -= var2;
                            var2 -= var0;
                            var0 = anIntArray1082[var0];

                            while (true) {
                                --var2;
                                if (var2 < 0) {
                                    while (true) {
                                        --var1;
                                        if (var1 < 0) {
                                            return;
                                        }

                                        method640(buffer, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                        var5 += var27;
                                        var3 += var26;
                                        var6 += var31;
                                        var0 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method640(buffer, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                var4 += var28;
                                var3 += var26;
                                var6 += var31;
                                var0 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var1 -= var2;
                        var2 -= var0;
                        var0 = anIntArray1082[var0];

                        while (true) {
                            --var2;
                            if (var2 < 0) {
                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        return;
                                    }

                                    method640(buffer, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                    var5 += var27;
                                    var3 += var26;
                                    var6 += var31;
                                    var0 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }

                            method640(buffer, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                            var4 += var28;
                            var3 += var26;
                            var6 += var31;
                            var0 += areaWidth;
                            var32 += var34;
                            var35 += var37;
                            var38 += var40;
                        }
                    }
                } else if (var1 <= var2) {
                    if (var1 < anInt235) {
                        if (var2 > anInt235) {
                            var2 = anInt235;
                        }

                        if (var0 > anInt235) {
                            var0 = anInt235;
                        }

                        var7 = (var7 << 9) - var30 * var4 + var30;
                        if (var2 < var0) {
                            var3 = var4 <<= 14;
                            if (var1 < 0) {
                                var3 -= var26 * var1;
                                var4 -= var27 * var1;
                                var7 -= var31 * var1;
                                var1 = 0;
                            }

                            var5 <<= 14;
                            if (var2 < 0) {
                                var5 -= var28 * var2;
                                var2 = 0;
                            }

                            var41 = var1 - viewportCenterY;
                            var32 += var34 * var41;
                            var35 += var37 * var41;
                            var38 += var40 * var41;
                            if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
                                var0 -= var2;
                                var2 -= var1;
                                var1 = anIntArray1082[var1];

                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        while (true) {
                                            --var0;
                                            if (var0 < 0) {
                                                return;
                                            }

                                            method640(buffer, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                            var3 += var26;
                                            var5 += var28;
                                            var7 += var31;
                                            var1 += areaWidth;
                                            var32 += var34;
                                            var35 += var37;
                                            var38 += var40;
                                        }
                                    }

                                    method640(buffer, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                    var3 += var26;
                                    var4 += var27;
                                    var7 += var31;
                                    var1 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }
                            var0 -= var2;
                            var2 -= var1;
                            var1 = anIntArray1082[var1];

                            while (true) {
                                --var2;
                                if (var2 < 0) {
                                    while (true) {
                                        --var0;
                                        if (var0 < 0) {
                                            return;
                                        }

                                        method640(buffer, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                        var3 += var26;
                                        var5 += var28;
                                        var7 += var31;
                                        var1 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method640(buffer, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                var3 += var26;
                                var4 += var27;
                                var7 += var31;
                                var1 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var5 = var4 <<= 14;
                        if (var1 < 0) {
                            var5 -= var26 * var1;
                            var4 -= var27 * var1;
                            var7 -= var31 * var1;
                            var1 = 0;
                        }

                        var3 <<= 14;
                        if (var0 < 0) {
                            var3 -= var28 * var0;
                            var0 = 0;
                        }

                        var41 = var1 - viewportCenterY;
                        var32 += var34 * var41;
                        var35 += var37 * var41;
                        var38 += var40 * var41;
                        if (var26 < var27) {
                            var2 -= var0;
                            var0 -= var1;
                            var1 = anIntArray1082[var1];

                            while (true) {
                                --var0;
                                if (var0 < 0) {
                                    while (true) {
                                        --var2;
                                        if (var2 < 0) {
                                            return;
                                        }

                                        method640(buffer, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                        var3 += var28;
                                        var4 += var27;
                                        var7 += var31;
                                        var1 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method640(buffer, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                var5 += var26;
                                var4 += var27;
                                var7 += var31;
                                var1 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var2 -= var0;
                        var0 -= var1;
                        var1 = anIntArray1082[var1];

                        while (true) {
                            --var0;
                            if (var0 < 0) {
                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        return;
                                    }

                                    method640(buffer, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                    var3 += var28;
                                    var4 += var27;
                                    var7 += var31;
                                    var1 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }

                            method640(buffer, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                            var5 += var26;
                            var4 += var27;
                            var7 += var31;
                            var1 += areaWidth;
                            var32 += var34;
                            var35 += var37;
                            var38 += var40;
                        }
                    }
                } else if (var2 < anInt235) {
                    if (var0 > anInt235) {
                        var0 = anInt235;
                    }

                    if (var1 > anInt235) {
                        var1 = anInt235;
                    }

                    var8 = (var8 << 9) - var30 * var5 + var30;
                    if (var0 < var1) {
                        var4 = var5 <<= 14;
                        if (var2 < 0) {
                            var4 -= var27 * var2;
                            var5 -= var28 * var2;
                            var8 -= var31 * var2;
                            var2 = 0;
                        }

                        var3 <<= 14;
                        if (var0 < 0) {
                            var3 -= var26 * var0;
                            var0 = 0;
                        }

                        var41 = var2 - viewportCenterY;
                        var32 += var34 * var41;
                        var35 += var37 * var41;
                        var38 += var40 * var41;
                        if (var27 < var28) {
                            var1 -= var0;
                            var0 -= var2;
                            var2 = anIntArray1082[var2];

                            while (true) {
                                --var0;
                                if (var0 < 0) {
                                    while (true) {
                                        --var1;
                                        if (var1 < 0) {
                                            return;
                                        }

                                        method640(buffer, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                        var4 += var27;
                                        var3 += var26;
                                        var8 += var31;
                                        var2 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method640(buffer, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                var4 += var27;
                                var5 += var28;
                                var8 += var31;
                                var2 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var1 -= var0;
                        var0 -= var2;
                        var2 = anIntArray1082[var2];

                        while (true) {
                            --var0;
                            if (var0 < 0) {
                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        return;
                                    }

                                    method640(buffer, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                    var4 += var27;
                                    var3 += var26;
                                    var8 += var31;
                                    var2 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }

                            method640(buffer, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                            var4 += var27;
                            var5 += var28;
                            var8 += var31;
                            var2 += areaWidth;
                            var32 += var34;
                            var35 += var37;
                            var38 += var40;
                        }
                    }
                    var3 = var5 <<= 14;
                    if (var2 < 0) {
                        var3 -= var27 * var2;
                        var5 -= var28 * var2;
                        var8 -= var31 * var2;
                        var2 = 0;
                    }

                    var4 <<= 14;
                    if (var1 < 0) {
                        var4 -= var26 * var1;
                        var1 = 0;
                    }

                    var41 = var2 - viewportCenterY;
                    var32 += var34 * var41;
                    var35 += var37 * var41;
                    var38 += var40 * var41;
                    if (var27 < var28) {
                        var0 -= var1;
                        var1 -= var2;
                        var2 = anIntArray1082[var2];

                        while (true) {
                            --var1;
                            if (var1 < 0) {
                                while (true) {
                                    --var0;
                                    if (var0 < 0) {
                                        return;
                                    }

                                    method640(buffer, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                    var4 += var26;
                                    var5 += var28;
                                    var8 += var31;
                                    var2 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }

                            method640(buffer, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                            var3 += var27;
                            var5 += var28;
                            var8 += var31;
                            var2 += areaWidth;
                            var32 += var34;
                            var35 += var37;
                            var38 += var40;
                        }
                    }
                    var0 -= var1;
                    var1 -= var2;
                    var2 = anIntArray1082[var2];

                    while (true) {
                        --var1;
                        if (var1 < 0) {
                            while (true) {
                                --var0;
                                if (var0 < 0) {
                                    return;
                                }

                                method640(buffer, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                var4 += var26;
                                var5 += var28;
                                var8 += var31;
                                var2 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }

                        method640(buffer, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += areaWidth;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                    }
                }
            }
        }
    }

    static void method633(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
        int[] var19 = aTextureProvider1085.getPixels(var18);
        int var20;
        if (var19 == null) {
            var20 = aTextureProvider1085.method501(var18);
            method638(var0, var1, var2, var3, var4, var5, method634(var20, var6), method634(var20, var7), method634(var20, var8));
        } else {
            aBoolean316 = aTextureProvider1085.method503(var18);
            aBoolean324 = aTextureProvider1085.method500(var18);
            var20 = var4 - var3;
            int var21 = var1 - var0;
            int var22 = var5 - var3;
            int var23 = var2 - var0;
            int var24 = var7 - var6;
            int var25 = var8 - var6;
            int var26 = 0;
            if (var1 != var0) {
                var26 = (var4 - var3 << 14) / (var1 - var0);
            }

            int var27 = 0;
            if (var2 != var1) {
                var27 = (var5 - var4 << 14) / (var2 - var1);
            }

            int var28 = 0;
            if (var2 != var0) {
                var28 = (var3 - var5 << 14) / (var0 - var2);
            }

            int var29 = var20 * var23 - var22 * var21;
            if (var29 != 0) {
                int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
                int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
                var10 = var9 - var10;
                var13 = var12 - var13;
                var16 = var15 - var16;
                var11 -= var9;
                var14 -= var12;
                var17 -= var15;
                int var32 = var11 * var12 - var14 * var9 << 14;
                int var33 = (int) (((long) (var14 * var15 - var17 * var12) << 14) / (long) anInt228);
                int var34 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / (long) anInt228);
                int var35 = var10 * var12 - var13 * var9 << 14;
                int var36 = (int) (((long) (var13 * var15 - var16 * var12) << 14) / (long) anInt228);
                int var37 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / (long) anInt228);
                int var38 = var13 * var11 - var10 * var14 << 14;
                int var39 = (int) (((long) (var16 * var14 - var13 * var17) << 14) / (long) anInt228);
                int var40 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / (long) anInt228);
                int var41;
                if (var0 <= var1 && var0 <= var2) {
                    if (var0 < anInt235) {
                        if (var1 > anInt235) {
                            var1 = anInt235;
                        }

                        if (var2 > anInt235) {
                            var2 = anInt235;
                        }

                        var6 = (var6 << 9) - var30 * var3 + var30;
                        if (var1 < var2) {
                            var5 = var3 <<= 14;
                            if (var0 < 0) {
                                var5 -= var28 * var0;
                                var3 -= var26 * var0;
                                var6 -= var31 * var0;
                                var0 = 0;
                            }

                            var4 <<= 14;
                            if (var1 < 0) {
                                var4 -= var27 * var1;
                                var1 = 0;
                            }

                            var41 = var0 - viewportCenterY;
                            var32 += var34 * var41;
                            var35 += var37 * var41;
                            var38 += var40 * var41;
                            if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) {
                                var2 -= var1;
                                var1 -= var0;
                                var0 = anIntArray1082[var0];

                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        while (true) {
                                            --var2;
                                            if (var2 < 0) {
                                                return;
                                            }

                                            method639(buffer, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                            var5 += var28;
                                            var4 += var27;
                                            var6 += var31;
                                            var0 += areaWidth;
                                            var32 += var34;
                                            var35 += var37;
                                            var38 += var40;
                                        }
                                    }

                                    method639(buffer, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                    var5 += var28;
                                    var3 += var26;
                                    var6 += var31;
                                    var0 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }
                            var2 -= var1;
                            var1 -= var0;
                            var0 = anIntArray1082[var0];

                            while (true) {
                                --var1;
                                if (var1 < 0) {
                                    while (true) {
                                        --var2;
                                        if (var2 < 0) {
                                            return;
                                        }

                                        method639(buffer, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                        var5 += var28;
                                        var4 += var27;
                                        var6 += var31;
                                        var0 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method639(buffer, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                var5 += var28;
                                var3 += var26;
                                var6 += var31;
                                var0 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var4 = var3 <<= 14;
                        if (var0 < 0) {
                            var4 -= var28 * var0;
                            var3 -= var26 * var0;
                            var6 -= var31 * var0;
                            var0 = 0;
                        }

                        var5 <<= 14;
                        if (var2 < 0) {
                            var5 -= var27 * var2;
                            var2 = 0;
                        }

                        var41 = var0 - viewportCenterY;
                        var32 += var34 * var41;
                        var35 += var37 * var41;
                        var38 += var40 * var41;
                        if (var0 != var2 && var28 < var26 || var0 == var2 && var27 > var26) {
                            var1 -= var2;
                            var2 -= var0;
                            var0 = anIntArray1082[var0];

                            while (true) {
                                --var2;
                                if (var2 < 0) {
                                    while (true) {
                                        --var1;
                                        if (var1 < 0) {
                                            return;
                                        }

                                        method639(buffer, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                        var5 += var27;
                                        var3 += var26;
                                        var6 += var31;
                                        var0 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method639(buffer, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                var4 += var28;
                                var3 += var26;
                                var6 += var31;
                                var0 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var1 -= var2;
                        var2 -= var0;
                        var0 = anIntArray1082[var0];

                        while (true) {
                            --var2;
                            if (var2 < 0) {
                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        return;
                                    }

                                    method639(buffer, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                                    var5 += var27;
                                    var3 += var26;
                                    var6 += var31;
                                    var0 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }

                            method639(buffer, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
                            var4 += var28;
                            var3 += var26;
                            var6 += var31;
                            var0 += areaWidth;
                            var32 += var34;
                            var35 += var37;
                            var38 += var40;
                        }
                    }
                } else if (var1 <= var2) {
                    if (var1 < anInt235) {
                        if (var2 > anInt235) {
                            var2 = anInt235;
                        }

                        if (var0 > anInt235) {
                            var0 = anInt235;
                        }

                        var7 = (var7 << 9) - var30 * var4 + var30;
                        if (var2 < var0) {
                            var3 = var4 <<= 14;
                            if (var1 < 0) {
                                var3 -= var26 * var1;
                                var4 -= var27 * var1;
                                var7 -= var31 * var1;
                                var1 = 0;
                            }

                            var5 <<= 14;
                            if (var2 < 0) {
                                var5 -= var28 * var2;
                                var2 = 0;
                            }

                            var41 = var1 - viewportCenterY;
                            var32 += var34 * var41;
                            var35 += var37 * var41;
                            var38 += var40 * var41;
                            if ((var1 == var2 || var26 >= var27) && (var1 != var2 || var26 <= var28)) {
                                var0 -= var2;
                                var2 -= var1;
                                var1 = anIntArray1082[var1];

                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        while (true) {
                                            --var0;
                                            if (var0 < 0) {
                                                return;
                                            }

                                            method639(buffer, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                            var3 += var26;
                                            var5 += var28;
                                            var7 += var31;
                                            var1 += areaWidth;
                                            var32 += var34;
                                            var35 += var37;
                                            var38 += var40;
                                        }
                                    }

                                    method639(buffer, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                    var3 += var26;
                                    var4 += var27;
                                    var7 += var31;
                                    var1 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }
                            var0 -= var2;
                            var2 -= var1;
                            var1 = anIntArray1082[var1];

                            while (true) {
                                --var2;
                                if (var2 < 0) {
                                    while (true) {
                                        --var0;
                                        if (var0 < 0) {
                                            return;
                                        }

                                        method639(buffer, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                        var3 += var26;
                                        var5 += var28;
                                        var7 += var31;
                                        var1 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method639(buffer, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                var3 += var26;
                                var4 += var27;
                                var7 += var31;
                                var1 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var5 = var4 <<= 14;
                        if (var1 < 0) {
                            var5 -= var26 * var1;
                            var4 -= var27 * var1;
                            var7 -= var31 * var1;
                            var1 = 0;
                        }

                        var3 <<= 14;
                        if (var0 < 0) {
                            var3 -= var28 * var0;
                            var0 = 0;
                        }

                        var41 = var1 - viewportCenterY;
                        var32 += var34 * var41;
                        var35 += var37 * var41;
                        var38 += var40 * var41;
                        if (var26 < var27) {
                            var2 -= var0;
                            var0 -= var1;
                            var1 = anIntArray1082[var1];

                            while (true) {
                                --var0;
                                if (var0 < 0) {
                                    while (true) {
                                        --var2;
                                        if (var2 < 0) {
                                            return;
                                        }

                                        method639(buffer, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                        var3 += var28;
                                        var4 += var27;
                                        var7 += var31;
                                        var1 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method639(buffer, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                var5 += var26;
                                var4 += var27;
                                var7 += var31;
                                var1 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var2 -= var0;
                        var0 -= var1;
                        var1 = anIntArray1082[var1];

                        while (true) {
                            --var0;
                            if (var0 < 0) {
                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        return;
                                    }

                                    method639(buffer, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                                    var3 += var28;
                                    var4 += var27;
                                    var7 += var31;
                                    var1 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }

                            method639(buffer, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
                            var5 += var26;
                            var4 += var27;
                            var7 += var31;
                            var1 += areaWidth;
                            var32 += var34;
                            var35 += var37;
                            var38 += var40;
                        }
                    }
                } else if (var2 < anInt235) {
                    if (var0 > anInt235) {
                        var0 = anInt235;
                    }

                    if (var1 > anInt235) {
                        var1 = anInt235;
                    }

                    var8 = (var8 << 9) - var30 * var5 + var30;
                    if (var0 < var1) {
                        var4 = var5 <<= 14;
                        if (var2 < 0) {
                            var4 -= var27 * var2;
                            var5 -= var28 * var2;
                            var8 -= var31 * var2;
                            var2 = 0;
                        }

                        var3 <<= 14;
                        if (var0 < 0) {
                            var3 -= var26 * var0;
                            var0 = 0;
                        }

                        var41 = var2 - viewportCenterY;
                        var32 += var34 * var41;
                        var35 += var37 * var41;
                        var38 += var40 * var41;
                        if (var27 < var28) {
                            var1 -= var0;
                            var0 -= var2;
                            var2 = anIntArray1082[var2];

                            while (true) {
                                --var0;
                                if (var0 < 0) {
                                    while (true) {
                                        --var1;
                                        if (var1 < 0) {
                                            return;
                                        }

                                        method639(buffer, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                        var4 += var27;
                                        var3 += var26;
                                        var8 += var31;
                                        var2 += areaWidth;
                                        var32 += var34;
                                        var35 += var37;
                                        var38 += var40;
                                    }
                                }

                                method639(buffer, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                var4 += var27;
                                var5 += var28;
                                var8 += var31;
                                var2 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }
                        var1 -= var0;
                        var0 -= var2;
                        var2 = anIntArray1082[var2];

                        while (true) {
                            --var0;
                            if (var0 < 0) {
                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        return;
                                    }

                                    method639(buffer, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                    var4 += var27;
                                    var3 += var26;
                                    var8 += var31;
                                    var2 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }

                            method639(buffer, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                            var4 += var27;
                            var5 += var28;
                            var8 += var31;
                            var2 += areaWidth;
                            var32 += var34;
                            var35 += var37;
                            var38 += var40;
                        }
                    }
                    var3 = var5 <<= 14;
                    if (var2 < 0) {
                        var3 -= var27 * var2;
                        var5 -= var28 * var2;
                        var8 -= var31 * var2;
                        var2 = 0;
                    }

                    var4 <<= 14;
                    if (var1 < 0) {
                        var4 -= var26 * var1;
                        var1 = 0;
                    }

                    var41 = var2 - viewportCenterY;
                    var32 += var34 * var41;
                    var35 += var37 * var41;
                    var38 += var40 * var41;
                    if (var27 < var28) {
                        var0 -= var1;
                        var1 -= var2;
                        var2 = anIntArray1082[var2];

                        while (true) {
                            --var1;
                            if (var1 < 0) {
                                while (true) {
                                    --var0;
                                    if (var0 < 0) {
                                        return;
                                    }

                                    method639(buffer, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                    var4 += var26;
                                    var5 += var28;
                                    var8 += var31;
                                    var2 += areaWidth;
                                    var32 += var34;
                                    var35 += var37;
                                    var38 += var40;
                                }
                            }

                            method639(buffer, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                            var3 += var27;
                            var5 += var28;
                            var8 += var31;
                            var2 += areaWidth;
                            var32 += var34;
                            var35 += var37;
                            var38 += var40;
                        }
                    }
                    var0 -= var1;
                    var1 -= var2;
                    var2 = anIntArray1082[var2];

                    while (true) {
                        --var1;
                        if (var1 < 0) {
                            while (true) {
                                --var0;
                                if (var0 < 0) {
                                    return;
                                }

                                method639(buffer, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                                var4 += var26;
                                var5 += var28;
                                var8 += var31;
                                var2 += areaWidth;
                                var32 += var34;
                                var35 += var37;
                                var38 += var40;
                            }
                        }

                        method639(buffer, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var5 += var28;
                        var8 += var31;
                        var2 += areaWidth;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                    }
                }
            }
        }
    }

    static int method634(int var0, int var1) {
        var1 = var1 * (var0 & 127) >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 'ﾀ') + var1;
    }

    static int method630(int var0, int var1, int var2, int var3) {
        return var0 * var2 + var1 * var3 >> 16;
    }

    static int method646(int var0, int var1, int var2, int var3) {
        return var1 * var2 - var0 * var3 >> 16;
    }

    static int method628(int var0, int var1, int var2, int var3) {
        return var0 * var2 - var1 * var3 >> 16;
    }

    static int method647(int var0, int var1, int var2, int var3) {
        return var0 * var3 + var1 * var2 >> 16;
    }

    public static void method637(int var0, int var1, int var2) {
        aBoolean1083 = var0 < 0 || var0 > anInt919 || var1 < 0 || var1 > anInt919 || var2 < 0 || var2 > anInt919;
    }

    static int method642(int var0, int var1, int var2, int var3) {
        return var0 * var2 + var1 * var3 >> 16;
    }

    static int method643(int var0, int var1, int var2, int var3) {
        return var1 * var2 - var0 * var3 >> 16;
    }

    static void method631(int[] var0, int var1, int var2, int var3, int var4, int var5) {
        if (aBoolean1083) {
            if (var5 > anInt919) {
                var5 = anInt919;
            }

            if (var4 < 0) {
                var4 = 0;
            }
        }

        if (var4 < var5) {
            var1 += var4;
            var3 = var5 - var4 >> 2;
            if (anInt327 != 0) {
                if (anInt327 == 254) {
                    while (true) {
                        --var3;
                        if (var3 < 0) {
                            var3 = var5 - var4 & 3;

                            while (true) {
                                --var3;
                                if (var3 < 0) {
                                    return;
                                }

                                var0[var1++] = var0[var1];
                            }
                        }

                        var0[var1++] = var0[var1];
                        var0[var1++] = var0[var1];
                        var0[var1++] = var0[var1];
                        var0[var1++] = var0[var1];
                    }
                }
                int var6 = anInt327;
                int var7 = 256 - anInt327;
                var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & '\uff00') * var7 >> 8 & '\uff00');

                while (true) {
                    --var3;
                    int var8;
                    if (var3 < 0) {
                        var3 = var5 - var4 & 3;

                        while (true) {
                            --var3;
                            if (var3 < 0) {
                                return;
                            }

                            var8 = var0[var1];
                            var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                        }
                    }

                    var8 = var0[var1];
                    var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                    var8 = var0[var1];
                    var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                    var8 = var0[var1];
                    var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                    var8 = var0[var1];
                    var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
                }
            }
            while (true) {
                --var3;
                if (var3 < 0) {
                    var3 = var5 - var4 & 3;

                    while (true) {
                        --var3;
                        if (var3 < 0) {
                            return;
                        }

                        var0[var1++] = var2;
                    }
                }

                var0[var1++] = var2;
                var0[var1++] = var2;
                var0[var1++] = var2;
                var0[var1++] = var2;
            }
        }
    }

    static void method639(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
        if (aBoolean1083) {
            if (var6 > anInt919) {
                var6 = anInt919;
            }

            if (var5 < 0) {
                var5 = 0;
            }
        }

        if (var5 < var6) {
            var4 += var5;
            var7 += var8 * var5;
            int var15 = var6 - var5;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            if (aBoolean316) {
                var16 = var5 - viewportCenterX;
                var9 += var12 * var16;
                var10 += var13 * var16;
                var11 += var14 * var16;
                var17 = var11 >> 12;
                if (var17 != 0) {
                    var18 = var9 / var17;
                    var19 = var10 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                }

                var9 += var12 * var15;
                var10 += var13 * var15;
                var11 += var14 * var15;
                var17 = var11 >> 12;
                if (var17 != 0) {
                    var20 = var9 / var17;
                    var21 = var10 / var17;
                } else {
                    var20 = 0;
                    var21 = 0;
                }

                var2 = (var18 << 20) + var19;
                var22 = ((var20 - var18) / var15 << 20) + (var21 - var19) / var15;
                var15 >>= 3;
                var8 <<= 3;
                var23 = var7 >> 8;
                if (aBoolean324) {
                    if (var15 > 0) {
                        do {
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var7 += var8;
                            var23 = var7 >> 8;
                            --var15;
                        } while (var15 > 0);
                    }

                    var15 = var6 - var5 & 7;
                    if (var15 > 0) {
                        do {
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            --var15;
                        } while (var15 > 0);
                    }
                } else {
                    if (var15 > 0) {
                        do {
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            var7 += var8;
                            var23 = var7 >> 8;
                            --var15;
                        } while (var15 > 0);
                    }

                    var15 = var6 - var5 & 7;
                    if (var15 > 0) {
                        do {
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            --var15;
                        } while (var15 > 0);
                    }
                }
            } else {
                var16 = var5 - viewportCenterX;
                var9 += var12 * var16;
                var10 += var13 * var16;
                var11 += var14 * var16;
                var17 = var11 >> 14;
                if (var17 != 0) {
                    var18 = var9 / var17;
                    var19 = var10 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                }

                var9 += var12 * var15;
                var10 += var13 * var15;
                var11 += var14 * var15;
                var17 = var11 >> 14;
                if (var17 != 0) {
                    var20 = var9 / var17;
                    var21 = var10 / var17;
                } else {
                    var20 = 0;
                    var21 = 0;
                }

                var2 = (var18 << 18) + var19;
                var22 = ((var20 - var18) / var15 << 18) + (var21 - var19) / var15;
                var15 >>= 3;
                var8 <<= 3;
                var23 = var7 >> 8;
                if (aBoolean324) {
                    if (var15 > 0) {
                        do {
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var7 += var8;
                            var23 = var7 >> 8;
                            --var15;
                        } while (var15 > 0);
                    }

                    var15 = var6 - var5 & 7;
                    if (var15 > 0) {
                        do {
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            --var15;
                        } while (var15 > 0);
                    }
                } else {
                    if (var15 > 0) {
                        do {
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            var7 += var8;
                            var23 = var7 >> 8;
                            --var15;
                        } while (var15 > 0);
                    }

                    var15 = var6 - var5 & 7;
                    if (var15 > 0) {
                        do {
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            --var15;
                        } while (var15 > 0);
                    }
                }
            }

        }
    }

    public static void method627(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = 0;
        if (var1 != var0) {
            var7 = (var4 - var3 << 14) / (var1 - var0);
        }

        int var8 = 0;
        if (var2 != var1) {
            var8 = (var5 - var4 << 14) / (var2 - var1);
        }

        int var9 = 0;
        if (var2 != var0) {
            var9 = (var3 - var5 << 14) / (var0 - var2);
        }

        if (var0 <= var1 && var0 <= var2) {
            if (var0 < anInt235) {
                if (var1 > anInt235) {
                    var1 = anInt235;
                }

                if (var2 > anInt235) {
                    var2 = anInt235;
                }

                if (var1 < var2) {
                    var5 = var3 <<= 14;
                    if (var0 < 0) {
                        var5 -= var9 * var0;
                        var3 -= var7 * var0;
                        var0 = 0;
                    }

                    var4 <<= 14;
                    if (var1 < 0) {
                        var4 -= var8 * var1;
                        var1 = 0;
                    }

                    if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) {
                        var2 -= var1;
                        var1 -= var0;
                        var0 = anIntArray1082[var0];

                        while (true) {
                            --var1;
                            if (var1 < 0) {
                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        return;
                                    }

                                    method631(buffer, var0, var6, 0, var5 >> 14, var4 >> 14);
                                    var5 += var9;
                                    var4 += var8;
                                    var0 += areaWidth;
                                }
                            }

                            method631(buffer, var0, var6, 0, var5 >> 14, var3 >> 14);
                            var5 += var9;
                            var3 += var7;
                            var0 += areaWidth;
                        }
                    }
                    var2 -= var1;
                    var1 -= var0;
                    var0 = anIntArray1082[var0];

                    while (true) {
                        --var1;
                        if (var1 < 0) {
                            while (true) {
                                --var2;
                                if (var2 < 0) {
                                    return;
                                }

                                method631(buffer, var0, var6, 0, var4 >> 14, var5 >> 14);
                                var5 += var9;
                                var4 += var8;
                                var0 += areaWidth;
                            }
                        }

                        method631(buffer, var0, var6, 0, var3 >> 14, var5 >> 14);
                        var5 += var9;
                        var3 += var7;
                        var0 += areaWidth;
                    }
                }
                var4 = var3 <<= 14;
                if (var0 < 0) {
                    var4 -= var9 * var0;
                    var3 -= var7 * var0;
                    var0 = 0;
                }

                var5 <<= 14;
                if (var2 < 0) {
                    var5 -= var8 * var2;
                    var2 = 0;
                }

                if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
                    var1 -= var2;
                    var2 -= var0;
                    var0 = anIntArray1082[var0];

                    while (true) {
                        --var2;
                        if (var2 < 0) {
                            while (true) {
                                --var1;
                                if (var1 < 0) {
                                    return;
                                }

                                method631(buffer, var0, var6, 0, var5 >> 14, var3 >> 14);
                                var5 += var8;
                                var3 += var7;
                                var0 += areaWidth;
                            }
                        }

                        method631(buffer, var0, var6, 0, var4 >> 14, var3 >> 14);
                        var4 += var9;
                        var3 += var7;
                        var0 += areaWidth;
                    }
                }
                var1 -= var2;
                var2 -= var0;
                var0 = anIntArray1082[var0];

                while (true) {
                    --var2;
                    if (var2 < 0) {
                        while (true) {
                            --var1;
                            if (var1 < 0) {
                                return;
                            }

                            method631(buffer, var0, var6, 0, var3 >> 14, var5 >> 14);
                            var5 += var8;
                            var3 += var7;
                            var0 += areaWidth;
                        }
                    }

                    method631(buffer, var0, var6, 0, var3 >> 14, var4 >> 14);
                    var4 += var9;
                    var3 += var7;
                    var0 += areaWidth;
                }
            }
        } else if (var1 <= var2) {
            if (var1 < anInt235) {
                if (var2 > anInt235) {
                    var2 = anInt235;
                }

                if (var0 > anInt235) {
                    var0 = anInt235;
                }

                if (var2 < var0) {
                    var3 = var4 <<= 14;
                    if (var1 < 0) {
                        var3 -= var7 * var1;
                        var4 -= var8 * var1;
                        var1 = 0;
                    }

                    var5 <<= 14;
                    if (var2 < 0) {
                        var5 -= var9 * var2;
                        var2 = 0;
                    }

                    if (var1 != var2 && var7 < var8 || var1 == var2 && var7 > var9) {
                        var0 -= var2;
                        var2 -= var1;
                        var1 = anIntArray1082[var1];

                        while (true) {
                            --var2;
                            if (var2 < 0) {
                                while (true) {
                                    --var0;
                                    if (var0 < 0) {
                                        return;
                                    }

                                    method631(buffer, var1, var6, 0, var3 >> 14, var5 >> 14);
                                    var3 += var7;
                                    var5 += var9;
                                    var1 += areaWidth;
                                }
                            }

                            method631(buffer, var1, var6, 0, var3 >> 14, var4 >> 14);
                            var3 += var7;
                            var4 += var8;
                            var1 += areaWidth;
                        }
                    }
                    var0 -= var2;
                    var2 -= var1;
                    var1 = anIntArray1082[var1];

                    while (true) {
                        --var2;
                        if (var2 < 0) {
                            while (true) {
                                --var0;
                                if (var0 < 0) {
                                    return;
                                }

                                method631(buffer, var1, var6, 0, var5 >> 14, var3 >> 14);
                                var3 += var7;
                                var5 += var9;
                                var1 += areaWidth;
                            }
                        }

                        method631(buffer, var1, var6, 0, var4 >> 14, var3 >> 14);
                        var3 += var7;
                        var4 += var8;
                        var1 += areaWidth;
                    }
                }
                var5 = var4 <<= 14;
                if (var1 < 0) {
                    var5 -= var7 * var1;
                    var4 -= var8 * var1;
                    var1 = 0;
                }

                var3 <<= 14;
                if (var0 < 0) {
                    var3 -= var9 * var0;
                    var0 = 0;
                }

                if (var7 < var8) {
                    var2 -= var0;
                    var0 -= var1;
                    var1 = anIntArray1082[var1];

                    while (true) {
                        --var0;
                        if (var0 < 0) {
                            while (true) {
                                --var2;
                                if (var2 < 0) {
                                    return;
                                }

                                method631(buffer, var1, var6, 0, var3 >> 14, var4 >> 14);
                                var3 += var9;
                                var4 += var8;
                                var1 += areaWidth;
                            }
                        }

                        method631(buffer, var1, var6, 0, var5 >> 14, var4 >> 14);
                        var5 += var7;
                        var4 += var8;
                        var1 += areaWidth;
                    }
                }
                var2 -= var0;
                var0 -= var1;
                var1 = anIntArray1082[var1];

                while (true) {
                    --var0;
                    if (var0 < 0) {
                        while (true) {
                            --var2;
                            if (var2 < 0) {
                                return;
                            }

                            method631(buffer, var1, var6, 0, var4 >> 14, var3 >> 14);
                            var3 += var9;
                            var4 += var8;
                            var1 += areaWidth;
                        }
                    }

                    method631(buffer, var1, var6, 0, var4 >> 14, var5 >> 14);
                    var5 += var7;
                    var4 += var8;
                    var1 += areaWidth;
                }
            }
        } else if (var2 < anInt235) {
            if (var0 > anInt235) {
                var0 = anInt235;
            }

            if (var1 > anInt235) {
                var1 = anInt235;
            }

            if (var0 < var1) {
                var4 = var5 <<= 14;
                if (var2 < 0) {
                    var4 -= var8 * var2;
                    var5 -= var9 * var2;
                    var2 = 0;
                }

                var3 <<= 14;
                if (var0 < 0) {
                    var3 -= var7 * var0;
                    var0 = 0;
                }

                if (var8 < var9) {
                    var1 -= var0;
                    var0 -= var2;
                    var2 = anIntArray1082[var2];

                    while (true) {
                        --var0;
                        if (var0 < 0) {
                            while (true) {
                                --var1;
                                if (var1 < 0) {
                                    return;
                                }

                                method631(buffer, var2, var6, 0, var4 >> 14, var3 >> 14);
                                var4 += var8;
                                var3 += var7;
                                var2 += areaWidth;
                            }
                        }

                        method631(buffer, var2, var6, 0, var4 >> 14, var5 >> 14);
                        var4 += var8;
                        var5 += var9;
                        var2 += areaWidth;
                    }
                }
                var1 -= var0;
                var0 -= var2;
                var2 = anIntArray1082[var2];

                while (true) {
                    --var0;
                    if (var0 < 0) {
                        while (true) {
                            --var1;
                            if (var1 < 0) {
                                return;
                            }

                            method631(buffer, var2, var6, 0, var3 >> 14, var4 >> 14);
                            var4 += var8;
                            var3 += var7;
                            var2 += areaWidth;
                        }
                    }

                    method631(buffer, var2, var6, 0, var5 >> 14, var4 >> 14);
                    var4 += var8;
                    var5 += var9;
                    var2 += areaWidth;
                }
            }
            var3 = var5 <<= 14;
            if (var2 < 0) {
                var3 -= var8 * var2;
                var5 -= var9 * var2;
                var2 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
                var4 -= var7 * var1;
                var1 = 0;
            }

            if (var8 < var9) {
                var0 -= var1;
                var1 -= var2;
                var2 = anIntArray1082[var2];

                while (true) {
                    --var1;
                    if (var1 < 0) {
                        while (true) {
                            --var0;
                            if (var0 < 0) {
                                return;
                            }

                            method631(buffer, var2, var6, 0, var4 >> 14, var5 >> 14);
                            var4 += var7;
                            var5 += var9;
                            var2 += areaWidth;
                        }
                    }

                    method631(buffer, var2, var6, 0, var3 >> 14, var5 >> 14);
                    var3 += var8;
                    var5 += var9;
                    var2 += areaWidth;
                }
            }
            var0 -= var1;
            var1 -= var2;
            var2 = anIntArray1082[var2];

            while (true) {
                --var1;
                if (var1 < 0) {
                    while (true) {
                        --var0;
                        if (var0 < 0) {
                            return;
                        }

                        method631(buffer, var2, var6, 0, var5 >> 14, var4 >> 14);
                        var4 += var7;
                        var5 += var9;
                        var2 += areaWidth;
                    }
                }

                method631(buffer, var2, var6, 0, var5 >> 14, var3 >> 14);
                var3 += var8;
                var5 += var9;
                var2 += areaWidth;
            }
        }
    }

    public static void method641(int var0, int var1) {
        int var2 = anIntArray1082[0];
        int var3 = var2 / areaWidth;
        int var4 = var2 - var3 * areaWidth;
        viewportCenterX = var0 - var4;
        viewportCenterY = var1 - var3;
        anInt230 = -viewportCenterX;
        anInt222 = anInt919 - viewportCenterX;
        anInt229 = -viewportCenterY;
        anInt981 = anInt235 - viewportCenterY;
    }

    static void method636(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (aBoolean1083) {
            if (var5 > anInt919) {
                var5 = anInt919;
            }

            if (var4 < 0) {
                var4 = 0;
            }
        }

        if (var4 < var5) {
            var1 += var4;
            var6 += var7 * var4;
            int var8;
            int var9;
            int var10;
            if (aBoolean1084) {
                var3 = var5 - var4 >> 2;
                var7 <<= 2;
                if (anInt327 == 0) {
                    if (var3 > 0) {
                        do {
                            var2 = anIntArray240[var6 >> 8];
                            var6 += var7;
                            var0[var1++] = var2;
                            var0[var1++] = var2;
                            var0[var1++] = var2;
                            var0[var1++] = var2;
                            --var3;
                        } while (var3 > 0);
                    }

                    var3 = var5 - var4 & 3;
                    if (var3 > 0) {
                        var2 = anIntArray240[var6 >> 8];

                        do {
                            var0[var1++] = var2;
                            --var3;
                        } while (var3 > 0);
                    }
                } else {
                    var8 = anInt327;
                    var9 = 256 - anInt327;
                    if (var3 > 0) {
                        do {
                            var2 = anIntArray240[var6 >> 8];
                            var6 += var7;
                            var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
                            var10 = var0[var1];
                            var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                            var10 = var0[var1];
                            var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                            var10 = var0[var1];
                            var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                            var10 = var0[var1];
                            var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                            --var3;
                        } while (var3 > 0);
                    }

                    var3 = var5 - var4 & 3;
                    if (var3 > 0) {
                        var2 = anIntArray240[var6 >> 8];
                        var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');

                        do {
                            var10 = var0[var1];
                            var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                            --var3;
                        } while (var3 > 0);
                    }
                }

            } else {
                var3 = var5 - var4;
                if (anInt327 == 0) {
                    do {
                        var0[var1++] = anIntArray240[var6 >> 8];
                        var6 += var7;
                        --var3;
                    } while (var3 > 0);
                } else {
                    var8 = anInt327;
                    var9 = 256 - anInt327;

                    do {
                        var2 = anIntArray240[var6 >> 8];
                        var6 += var7;
                        var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
                        var10 = var0[var1];
                        var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                        --var3;
                    } while (var3 > 0);
                }

            }
        }
    }

    public static void method335() {
        viewportCenterX = anInt919 / 2;
        viewportCenterY = anInt235 / 2;
        anInt230 = -viewportCenterX;
        anInt222 = anInt919 - viewportCenterX;
        anInt229 = -viewportCenterY;
        anInt981 = anInt235 - viewportCenterY;
    }

    static void method640(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
        if (aBoolean1083) {
            if (var6 > anInt919) {
                var6 = anInt919;
            }

            if (var5 < 0) {
                var5 = 0;
            }
        }

        if (var5 < var6) {
            var4 += var5;
            var7 += var8 * var5;
            int var15 = var6 - var5;
            int var16;
            int var10000;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            if (aBoolean316) {
                var16 = var5 - viewportCenterX;
                var9 += (var12 >> 3) * var16;
                var10 += (var13 >> 3) * var16;
                var11 += (var14 >> 3) * var16;
                var17 = var11 >> 12;
                if (var17 != 0) {
                    var18 = var9 / var17;
                    var19 = var10 / var17;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > 4032) {
                        var18 = 4032;
                    }
                } else {
                    var18 = 0;
                    var19 = 0;
                }

                var9 += var12;
                var10 += var13;
                var11 += var14;
                var17 = var11 >> 12;
                if (var17 != 0) {
                    var20 = var9 / var17;
                    var21 = var10 / var17;
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 > 4032) {
                        var20 = 4032;
                    }
                } else {
                    var20 = 0;
                    var21 = 0;
                }

                var2 = (var18 << 20) + var19;
                var22 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                var15 >>= 3;
                var8 <<= 3;
                var23 = var7 >> 8;
                if (aBoolean324) {
                    if (var15 > 0) {
                        do {
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var10000 = var2 + var22;
                            var18 = var20;
                            var19 = var21;
                            var9 += var12;
                            var10 += var13;
                            var11 += var14;
                            var17 = var11 >> 12;
                            if (var17 != 0) {
                                var20 = var9 / var17;
                                var21 = var10 / var17;
                                if (var20 < 0) {
                                    var20 = 0;
                                } else if (var20 > 4032) {
                                    var20 = 4032;
                                }
                            } else {
                                var20 = 0;
                                var21 = 0;
                            }

                            var2 = (var18 << 20) + var19;
                            var22 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                            var7 += var8;
                            var23 = var7 >> 8;
                            --var15;
                        } while (var15 > 0);
                    }

                    var15 = var6 - var5 & 7;
                    if (var15 > 0) {
                        do {
                            var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            --var15;
                        } while (var15 > 0);
                    }
                } else {
                    if (var15 > 0) {
                        do {
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var10000 = var2 + var22;
                            var18 = var20;
                            var19 = var21;
                            var9 += var12;
                            var10 += var13;
                            var11 += var14;
                            var17 = var11 >> 12;
                            if (var17 != 0) {
                                var20 = var9 / var17;
                                var21 = var10 / var17;
                                if (var20 < 0) {
                                    var20 = 0;
                                } else if (var20 > 4032) {
                                    var20 = 4032;
                                }
                            } else {
                                var20 = 0;
                                var21 = 0;
                            }

                            var2 = (var18 << 20) + var19;
                            var22 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                            var7 += var8;
                            var23 = var7 >> 8;
                            --var15;
                        } while (var15 > 0);
                    }

                    var15 = var6 - var5 & 7;
                    if (var15 > 0) {
                        do {
                            if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            --var15;
                        } while (var15 > 0);
                    }
                }
            } else {
                var16 = var5 - viewportCenterX;
                var9 += (var12 >> 3) * var16;
                var10 += (var13 >> 3) * var16;
                var11 += (var14 >> 3) * var16;
                var17 = var11 >> 14;
                if (var17 != 0) {
                    var18 = var9 / var17;
                    var19 = var10 / var17;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > 16256) {
                        var18 = 16256;
                    }
                } else {
                    var18 = 0;
                    var19 = 0;
                }

                var9 += var12;
                var10 += var13;
                var11 += var14;
                var17 = var11 >> 14;
                if (var17 != 0) {
                    var20 = var9 / var17;
                    var21 = var10 / var17;
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 > 16256) {
                        var20 = 16256;
                    }
                } else {
                    var20 = 0;
                    var21 = 0;
                }

                var2 = (var18 << 18) + var19;
                var22 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                var15 >>= 3;
                var8 <<= 3;
                var23 = var7 >> 8;
                if (aBoolean324) {
                    if (var15 > 0) {
                        do {
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var10000 = var2 + var22;
                            var18 = var20;
                            var19 = var21;
                            var9 += var12;
                            var10 += var13;
                            var11 += var14;
                            var17 = var11 >> 14;
                            if (var17 != 0) {
                                var20 = var9 / var17;
                                var21 = var10 / var17;
                                if (var20 < 0) {
                                    var20 = 0;
                                } else if (var20 > 16256) {
                                    var20 = 16256;
                                }
                            } else {
                                var20 = 0;
                                var21 = 0;
                            }

                            var2 = (var18 << 18) + var19;
                            var22 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                            var7 += var8;
                            var23 = var7 >> 8;
                            --var15;
                        } while (var15 > 0);
                    }

                    var15 = var6 - var5 & 7;
                    if (var15 > 0) {
                        do {
                            var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                            var0[var4++] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            var2 += var22;
                            --var15;
                        } while (var15 > 0);
                    }
                } else {
                    if (var15 > 0) {
                        do {
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var10000 = var2 + var22;
                            var18 = var20;
                            var19 = var21;
                            var9 += var12;
                            var10 += var13;
                            var11 += var14;
                            var17 = var11 >> 14;
                            if (var17 != 0) {
                                var20 = var9 / var17;
                                var21 = var10 / var17;
                                if (var20 < 0) {
                                    var20 = 0;
                                } else if (var20 > 16256) {
                                    var20 = 16256;
                                }
                            } else {
                                var20 = 0;
                                var21 = 0;
                            }

                            var2 = (var18 << 18) + var19;
                            var22 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                            var7 += var8;
                            var23 = var7 >> 8;
                            --var15;
                        } while (var15 > 0);
                    }

                    var15 = var6 - var5 & 7;
                    if (var15 > 0) {
                        do {
                            if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                                var0[var4] = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                            }

                            ++var4;
                            var2 += var22;
                            --var15;
                        } while (var15 > 0);
                    }
                }
            }

        }
    }

    static void method635(int var0, int var1, int var2, int var3) {
        anInt919 = var2 - var0;
        anInt235 = var3 - var1;
        method335();
        if (anIntArray1082.length < anInt235) {
            anIntArray1082 = new int[RS3CopyPastedNodeTable.nextPowerOf2(anInt235)];
        }

        int var4 = var1 * areaWidth + var0;

        for (int var5 = 0; var5 < anInt235; ++var5) {
            anIntArray1082[var5] = var4;
            var4 += areaWidth;
        }

    }
}
