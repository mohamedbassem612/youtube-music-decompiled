package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ag {
    private static final int[] b = {0, 4, 8};
    private static final SparseIntArray c;
    public final HashMap a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        int[] iArr = ai.a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(103, 6);
        sparseIntArray.append(104, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(111, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(106, 11);
        sparseIntArray.append(110, 15);
        sparseIntArray.append(107, 12);
        sparseIntArray.append(98, 40);
        sparseIntArray.append(83, 39);
        sparseIntArray.append(82, 41);
        sparseIntArray.append(97, 42);
        sparseIntArray.append(81, 20);
        sparseIntArray.append(96, 37);
        sparseIntArray.append(71, 5);
        sparseIntArray.append(84, 60);
        sparseIntArray.append(93, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(65, 60);
        sparseIntArray.append(61, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(99, 54);
        sparseIntArray.append(77, 55);
        sparseIntArray.append(100, 56);
        sparseIntArray.append(78, 57);
        sparseIntArray.append(101, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    private static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private static final String g(int i) {
        if (i == 3) {
            return "top";
        }
        if (i == 4) {
            return "bottom";
        }
        if (i != 5) {
            return i != 6 ? "end" : "start";
        }
        return "baseline";
    }

    public final af a(int i) {
        HashMap map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new af());
        }
        return (af) map.get(numValueOf);
    }

    public final void b(int i, int i2, int i3, int i4) {
        HashMap map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new af());
        }
        af afVar = (af) map.get(numValueOf);
        if (i2 == 3) {
            if (i4 == 3) {
                afVar.l = i3;
                afVar.m = -1;
                afVar.p = -1;
                return;
            } else if (i4 == 4) {
                afVar.m = i3;
                afVar.l = -1;
                afVar.p = -1;
                return;
            } else {
                throw new IllegalArgumentException("right to " + g(i4) + " undefined");
            }
        }
        if (i2 == 4) {
            if (i4 == 4) {
                afVar.o = i3;
                afVar.n = -1;
                afVar.p = -1;
                return;
            } else if (i4 == 3) {
                afVar.n = i3;
                afVar.o = -1;
                afVar.p = -1;
                return;
            } else {
                throw new IllegalArgumentException("right to " + g(i4) + " undefined");
            }
        }
        if (i2 == 5) {
            if (i4 != 5) {
                throw new IllegalArgumentException("right to " + g(i4) + " undefined");
            }
            afVar.p = i3;
            afVar.o = -1;
            afVar.n = -1;
            afVar.l = -1;
            afVar.m = -1;
            return;
        }
        if (i2 != 6) {
            if (i4 == 7) {
                afVar.t = i3;
                afVar.s = -1;
                return;
            } else if (i4 == 6) {
                afVar.s = i3;
                afVar.t = -1;
                return;
            } else {
                throw new IllegalArgumentException("right to " + g(i4) + " undefined");
            }
        }
        if (i4 == 6) {
            afVar.r = i3;
            afVar.q = -1;
        } else if (i4 == 7) {
            afVar.q = i3;
            afVar.r = -1;
        } else {
            throw new IllegalArgumentException("right to " + g(i4) + " undefined");
        }
    }

    public final void c(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    af afVar = new af();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, ai.b);
                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = typedArrayObtainStyledAttributes.getIndex(i2);
                        SparseIntArray sparseIntArray = c;
                        int i3 = sparseIntArray.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    afVar.p = f(typedArrayObtainStyledAttributes, index, afVar.p);
                                    break;
                                case 2:
                                    afVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.D);
                                    break;
                                case 3:
                                    afVar.o = f(typedArrayObtainStyledAttributes, index, afVar.o);
                                    break;
                                case 4:
                                    afVar.n = f(typedArrayObtainStyledAttributes, index, afVar.n);
                                    break;
                                case 5:
                                    afVar.w = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    afVar.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, afVar.x);
                                    break;
                                case 7:
                                    afVar.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, afVar.y);
                                    break;
                                case 8:
                                    afVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.E);
                                    break;
                                case 9:
                                    afVar.n = f(typedArrayObtainStyledAttributes, index, afVar.t);
                                    break;
                                case 10:
                                    afVar.s = f(typedArrayObtainStyledAttributes, index, afVar.s);
                                    break;
                                case 11:
                                    afVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.K);
                                    break;
                                case 12:
                                    afVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.L);
                                    break;
                                case 13:
                                    afVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.H);
                                    break;
                                case 14:
                                    afVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.J);
                                    break;
                                case 15:
                                    afVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.M);
                                    break;
                                case 16:
                                    afVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.I);
                                    break;
                                case 17:
                                    afVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, afVar.e);
                                    break;
                                case 18:
                                    afVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, afVar.f);
                                    break;
                                case 19:
                                    afVar.g = typedArrayObtainStyledAttributes.getFloat(index, afVar.g);
                                    break;
                                case 20:
                                    afVar.u = typedArrayObtainStyledAttributes.getFloat(index, afVar.u);
                                    break;
                                case 21:
                                    afVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, afVar.c);
                                    break;
                                case 22:
                                    int i4 = typedArrayObtainStyledAttributes.getInt(index, afVar.G);
                                    afVar.G = i4;
                                    afVar.G = b[i4];
                                    break;
                                case 23:
                                    afVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, afVar.b);
                                    break;
                                case 24:
                                    afVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.A);
                                    break;
                                case 25:
                                    afVar.h = f(typedArrayObtainStyledAttributes, index, afVar.h);
                                    break;
                                case 26:
                                    afVar.i = f(typedArrayObtainStyledAttributes, index, afVar.i);
                                    break;
                                case 27:
                                    afVar.z = typedArrayObtainStyledAttributes.getInt(index, afVar.z);
                                    break;
                                case 28:
                                    afVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.B);
                                    break;
                                case 29:
                                    afVar.j = f(typedArrayObtainStyledAttributes, index, afVar.j);
                                    break;
                                case 30:
                                    afVar.k = f(typedArrayObtainStyledAttributes, index, afVar.k);
                                    break;
                                case 31:
                                    afVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.F);
                                    break;
                                case 32:
                                    afVar.q = f(typedArrayObtainStyledAttributes, index, afVar.q);
                                    break;
                                case 33:
                                    afVar.r = f(typedArrayObtainStyledAttributes, index, afVar.r);
                                    break;
                                case 34:
                                    afVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, afVar.C);
                                    break;
                                case 35:
                                    afVar.m = f(typedArrayObtainStyledAttributes, index, afVar.m);
                                    break;
                                case 36:
                                    afVar.l = f(typedArrayObtainStyledAttributes, index, afVar.l);
                                    break;
                                case 37:
                                    afVar.v = typedArrayObtainStyledAttributes.getFloat(index, afVar.v);
                                    break;
                                case 38:
                                    afVar.d = typedArrayObtainStyledAttributes.getResourceId(index, afVar.d);
                                    break;
                                case 39:
                                    afVar.O = typedArrayObtainStyledAttributes.getFloat(index, afVar.O);
                                    break;
                                case 40:
                                    afVar.N = typedArrayObtainStyledAttributes.getFloat(index, afVar.N);
                                    break;
                                case 41:
                                    afVar.P = typedArrayObtainStyledAttributes.getInt(index, afVar.P);
                                    break;
                                case 42:
                                    afVar.Q = typedArrayObtainStyledAttributes.getInt(index, afVar.Q);
                                    break;
                                case 43:
                                    afVar.R = typedArrayObtainStyledAttributes.getFloat(index, afVar.R);
                                    break;
                                case 44:
                                    afVar.S = true;
                                    afVar.T = typedArrayObtainStyledAttributes.getFloat(index, afVar.T);
                                    break;
                                case 45:
                                    afVar.U = typedArrayObtainStyledAttributes.getFloat(index, afVar.U);
                                    break;
                                case 46:
                                    afVar.V = typedArrayObtainStyledAttributes.getFloat(index, afVar.V);
                                    break;
                                case 47:
                                    afVar.W = typedArrayObtainStyledAttributes.getFloat(index, afVar.W);
                                    break;
                                case 48:
                                    afVar.X = typedArrayObtainStyledAttributes.getFloat(index, afVar.X);
                                    break;
                                case 49:
                                    afVar.Y = typedArrayObtainStyledAttributes.getFloat(index, afVar.Y);
                                    break;
                                case 50:
                                    afVar.Z = typedArrayObtainStyledAttributes.getFloat(index, afVar.Z);
                                    break;
                                case 51:
                                    afVar.aa = typedArrayObtainStyledAttributes.getFloat(index, afVar.aa);
                                    break;
                                case 52:
                                    afVar.ab = typedArrayObtainStyledAttributes.getFloat(index, afVar.ab);
                                    break;
                                case 53:
                                    afVar.ac = typedArrayObtainStyledAttributes.getFloat(index, afVar.ac);
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        } else {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        afVar.a = true;
                    }
                    this.a.put(Integer.valueOf(afVar.d), afVar);
                } else {
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void d(int i, int i2, int i3) {
        af afVarA = a(i);
        if (i2 == 3) {
            afVarA.C = i3;
            return;
        }
        if (i2 == 4) {
            afVarA.D = i3;
        } else {
            if (i2 == 5) {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            if (i2 != 6) {
                afVarA.E = i3;
            } else {
                afVarA.F = i3;
            }
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        HashMap map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new af());
        }
        af afVar = (af) map.get(numValueOf);
        if (i2 != 6) {
            if (i4 == 7) {
                afVar.t = i3;
                afVar.s = -1;
            } else {
                afVar.s = i3;
                afVar.t = -1;
            }
            afVar.E = -1;
            return;
        }
        if (i4 == 6) {
            afVar.r = i3;
            afVar.q = -1;
        } else {
            afVar.q = i3;
            afVar.r = -1;
        }
        afVar.F = -1;
    }
}
