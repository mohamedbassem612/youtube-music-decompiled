package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kd {
    final hhb e;
    private final axr f = new axs(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;
    final ci d = new ci(this, (byte[]) null);

    public kd(hhb hhbVar) {
        this.e = hhbVar;
    }

    private final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            kc kcVar = (kc) arrayList.get(size);
            int i5 = kcVar.a;
            if (i5 == 8) {
                int i6 = kcVar.b;
                int i7 = kcVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            kcVar.b = i6 + 1;
                            kcVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            kcVar.b = i6 - 1;
                            kcVar.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        kcVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        kcVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        kcVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        kcVar.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = kcVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= kcVar.d;
                    } else if (i5 == 2) {
                        i += kcVar.d;
                    }
                } else if (i2 == 1) {
                    kcVar.b = i8 + 1;
                } else if (i2 == 2) {
                    kcVar.b = i8 - 1;
                }
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            kc kcVar2 = (kc) arrayList.get(size2);
            if (kcVar2.a == 8) {
                int i9 = kcVar2.d;
                if (i9 == kcVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    g(kcVar2);
                }
            } else if (kcVar2.d <= 0) {
                arrayList.remove(size2);
                g(kcVar2);
            }
        }
    }

    private final void m(kc kcVar) {
        int i;
        int i2 = kcVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(kcVar.b, i2);
        int i3 = kcVar.b;
        int i4 = kcVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(kcVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(kcVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < kcVar.d; i6++) {
            int iL2 = l(kcVar.b + (i * i6), kcVar.a);
            int i7 = kcVar.a;
            if (i7 == 2 ? iL2 != iL : !(i7 == 4 && iL2 == iL + 1)) {
                kc kcVarB = b(i7, iL, i5, kcVar.c);
                e(kcVarB, i3);
                g(kcVarB);
                if (kcVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iL = iL2;
            } else {
                i5++;
            }
        }
        Object obj = kcVar.c;
        g(kcVar);
        if (i5 > 0) {
            kc kcVarB2 = b(kcVar.a, iL, i5, obj);
            e(kcVarB2, i3);
            g(kcVarB2);
        }
    }

    private final void n(kc kcVar) {
        this.b.add(kcVar);
        int i = kcVar.a;
        if (i == 1) {
            this.e.x(kcVar.b, kcVar.d);
            return;
        }
        if (i == 2) {
            hhb hhbVar = this.e;
            int i2 = kcVar.b;
            int i3 = kcVar.d;
            RecyclerView recyclerView = (RecyclerView) hhbVar.a;
            recyclerView.S(i2, i3, false);
            recyclerView.P = true;
            return;
        }
        if (i == 4) {
            this.e.w(kcVar.b, kcVar.d, kcVar.c);
        } else if (i == 8) {
            this.e.y(kcVar.b, kcVar.d);
        } else {
            Objects.toString(kcVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(kcVar)));
        }
    }

    private final boolean o(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            kc kcVar = (kc) arrayList.get(i2);
            int i4 = kcVar.a;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = kcVar.b;
                    int i6 = kcVar.d + i5;
                    while (i5 < i6) {
                        if (a(i5, i3) == i) {
                            return true;
                        }
                        i5++;
                    }
                } else {
                    continue;
                }
                i2 = i3;
            } else {
                if (a(kcVar.d, i3) == i) {
                    return true;
                }
                i2 = i3;
            }
        }
        return false;
    }

    final int a(int i, int i2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i2 < size) {
            kc kcVar = (kc) arrayList.get(i2);
            int i3 = kcVar.a;
            if (i3 == 8) {
                int i4 = kcVar.b;
                if (i4 == i) {
                    i = kcVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (kcVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = kcVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = kcVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += kcVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final kc b(int i, int i2, int i3, Object obj) {
        kc kcVar = (kc) this.f.a();
        if (kcVar == null) {
            return new kc(i, i2, i3, obj);
        }
        kcVar.a = i;
        kcVar.b = i2;
        kcVar.d = i3;
        kcVar.c = obj;
        return kcVar;
    }

    public final void c() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.v((kc) arrayList.get(i));
        }
        h(arrayList);
        this.c = 0;
    }

    public final void d() {
        c();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kc kcVar = (kc) arrayList.get(i);
            int i2 = kcVar.a;
            if (i2 == 1) {
                hhb hhbVar = this.e;
                hhbVar.v(kcVar);
                hhbVar.x(kcVar.b, kcVar.d);
            } else if (i2 == 2) {
                hhb hhbVar2 = this.e;
                hhbVar2.v(kcVar);
                hhbVar2.z(kcVar.b, kcVar.d);
            } else if (i2 == 4) {
                hhb hhbVar3 = this.e;
                hhbVar3.v(kcVar);
                hhbVar3.w(kcVar.b, kcVar.d, kcVar.c);
            } else if (i2 == 8) {
                hhb hhbVar4 = this.e;
                hhbVar4.v(kcVar);
                hhbVar4.y(kcVar.b, kcVar.d);
            }
        }
        h(arrayList);
        this.c = 0;
    }

    final void e(kc kcVar, int i) {
        hhb hhbVar = this.e;
        hhbVar.v(kcVar);
        int i2 = kcVar.a;
        if (i2 == 2) {
            hhbVar.z(i, kcVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            hhbVar.w(i, kcVar.d, kcVar.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017e  */
    /* JADX WARN: Code duplicated, block: B:103:0x018c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0190  */
    /* JADX WARN: Code duplicated, block: B:177:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x012c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x0143  */
    /* JADX WARN: Code duplicated, block: B:86:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0154  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:90:0x015c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:97:0x0173  */
    public final void f() {
        ArrayList arrayList;
        int i;
        boolean z;
        byte b;
        kc kcVarB;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        kc kcVarB2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        while (true) {
            arrayList = this.a;
            i = -1;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((kc) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                } else {
                    z4 = false;
                }
                size--;
            }
            kc kcVarB3 = null;
            if (size == -1) {
                break;
            }
            ci ciVar = this.d;
            int i13 = size + 1;
            kc kcVar = (kc) arrayList.get(size);
            kc kcVar2 = (kc) arrayList.get(i13);
            int i14 = kcVar2.a;
            if (i14 == 1) {
                int i15 = kcVar.d;
                int i16 = kcVar2.b;
                i = i15 >= i16 ? 0 : -1;
                int i17 = kcVar.b;
                if (i17 < i16) {
                    i++;
                } else {
                    kcVar.b = i17 + kcVar2.d;
                }
                int i18 = kcVar2.b;
                if (i18 <= i15) {
                    kcVar.d = i15 + kcVar2.d;
                }
                kcVar2.b = i18 + i;
                arrayList.set(size, kcVar2);
                arrayList.set(i13, kcVar);
            } else if (i14 == 2) {
                int i19 = kcVar.b;
                int i20 = kcVar.d;
                if (i19 < i20) {
                    if (kcVar2.b == i19 && kcVar2.d == i20 - i19) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (kcVar2.b == i20 + 1 && kcVar2.d == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i21 = kcVar2.b;
                if (i20 < i21) {
                    i21--;
                    kcVar2.b = i21;
                } else {
                    int i22 = kcVar2.d;
                    if (i20 < i21 + i22) {
                        kcVar2.d = i22 - 1;
                        kcVar.a = 2;
                        kcVar.d = 1;
                        if (kcVar2.d == 0) {
                            arrayList.remove(i13);
                            ((kd) ciVar.a).g(kcVar2);
                        }
                    }
                }
                int i23 = kcVar.b;
                if (i23 <= i21) {
                    kcVar2.b = i21 + 1;
                } else {
                    int i24 = i21 + kcVar2.d;
                    if (i23 < i24) {
                        kcVarB2 = ((kd) ciVar.a).b(2, i23 + 1, i24 - i23, null);
                        kcVar2.d = kcVar.b - kcVar2.b;
                    }
                    if (z3) {
                        arrayList.set(size, kcVar2);
                        arrayList.remove(i13);
                        ((kd) ciVar.a).g(kcVar);
                    } else {
                        if (z2) {
                            if (kcVarB2 != null) {
                                i11 = kcVar.b;
                                if (i11 > kcVarB2.b) {
                                    kcVar.b = i11 - kcVarB2.d;
                                }
                                i12 = kcVar.d;
                                if (i12 > kcVarB2.b) {
                                    kcVar.d = i12 - kcVarB2.d;
                                }
                                kcVarB3 = kcVarB2;
                            }
                            i9 = kcVar.b;
                            if (i9 > kcVar2.b) {
                                kcVar.b = i9 - kcVar2.d;
                            }
                            i10 = kcVar.d;
                            if (i10 > kcVar2.b) {
                                kcVar.d = i10 - kcVar2.d;
                            }
                        } else {
                            if (kcVarB2 != null) {
                                i7 = kcVar.b;
                                if (i7 >= kcVarB2.b) {
                                    kcVar.b = i7 - kcVarB2.d;
                                }
                                i8 = kcVar.d;
                                if (i8 >= kcVarB2.b) {
                                    kcVar.d = i8 - kcVarB2.d;
                                }
                                kcVarB3 = kcVarB2;
                            }
                            i5 = kcVar.b;
                            if (i5 >= kcVar2.b) {
                                kcVar.b = i5 - kcVar2.d;
                            }
                            i6 = kcVar.d;
                            if (i6 >= kcVar2.b) {
                                kcVar.d = i6 - kcVar2.d;
                            }
                        }
                        arrayList.set(size, kcVar2);
                        if (kcVar.b != kcVar.d) {
                            arrayList.set(i13, kcVar);
                        } else {
                            arrayList.remove(i13);
                        }
                        if (kcVarB3 != null) {
                            arrayList.add(size, kcVarB3);
                        }
                    }
                }
                kcVarB2 = null;
                if (z3) {
                    arrayList.set(size, kcVar2);
                    arrayList.remove(i13);
                    ((kd) ciVar.a).g(kcVar);
                } else {
                    if (z2) {
                        if (kcVarB2 != null) {
                            i11 = kcVar.b;
                            if (i11 > kcVarB2.b) {
                                kcVar.b = i11 - kcVarB2.d;
                            }
                            i12 = kcVar.d;
                            if (i12 > kcVarB2.b) {
                                kcVar.d = i12 - kcVarB2.d;
                            }
                            kcVarB3 = kcVarB2;
                        }
                        i9 = kcVar.b;
                        if (i9 > kcVar2.b) {
                            kcVar.b = i9 - kcVar2.d;
                        }
                        i10 = kcVar.d;
                        if (i10 > kcVar2.b) {
                            kcVar.d = i10 - kcVar2.d;
                        }
                    } else {
                        if (kcVarB2 != null) {
                            i7 = kcVar.b;
                            if (i7 >= kcVarB2.b) {
                                kcVar.b = i7 - kcVarB2.d;
                            }
                            i8 = kcVar.d;
                            if (i8 >= kcVarB2.b) {
                                kcVar.d = i8 - kcVarB2.d;
                            }
                            kcVarB3 = kcVarB2;
                        }
                        i5 = kcVar.b;
                        if (i5 >= kcVar2.b) {
                            kcVar.b = i5 - kcVar2.d;
                        }
                        i6 = kcVar.d;
                        if (i6 >= kcVar2.b) {
                            kcVar.d = i6 - kcVar2.d;
                        }
                    }
                    arrayList.set(size, kcVar2);
                    if (kcVar.b != kcVar.d) {
                        arrayList.set(i13, kcVar);
                    } else {
                        arrayList.remove(i13);
                    }
                    if (kcVarB3 != null) {
                        arrayList.add(size, kcVarB3);
                    }
                }
            } else if (i14 == 4) {
                int i25 = kcVar.d;
                int i26 = kcVar2.b;
                if (i25 < i26) {
                    kcVar2.b = i26 - 1;
                } else {
                    int i27 = kcVar2.d;
                    if (i25 < i26 + i27) {
                        kcVar2.d = i27 - 1;
                        kcVarB = ((kd) ciVar.a).b(4, kcVar.b, 1, kcVar2.c);
                    }
                    i2 = kcVar.b;
                    i3 = kcVar2.b;
                    if (i2 <= i3) {
                        kcVar2.b = i3 + 1;
                    } else {
                        i4 = i3 + kcVar2.d;
                        if (i2 < i4) {
                            int i28 = i4 - i2;
                            kcVarB3 = ((kd) ciVar.a).b(4, i2 + 1, i28, kcVar2.c);
                            kcVar2.d -= i28;
                        }
                    }
                    arrayList.set(i13, kcVar);
                    if (kcVar2.d > 0) {
                        arrayList.set(size, kcVar2);
                    } else {
                        arrayList.remove(size);
                        ((kd) ciVar.a).g(kcVar2);
                    }
                    if (kcVarB != null) {
                        arrayList.add(size, kcVarB);
                    }
                    if (kcVarB3 != null) {
                        arrayList.add(size, kcVarB3);
                    }
                }
                kcVarB = null;
                i2 = kcVar.b;
                i3 = kcVar2.b;
                if (i2 <= i3) {
                    kcVar2.b = i3 + 1;
                } else {
                    i4 = i3 + kcVar2.d;
                    if (i2 < i4) {
                        int i29 = i4 - i2;
                        kcVarB3 = ((kd) ciVar.a).b(4, i2 + 1, i29, kcVar2.c);
                        kcVar2.d -= i29;
                    }
                }
                arrayList.set(i13, kcVar);
                if (kcVar2.d > 0) {
                    arrayList.set(size, kcVar2);
                } else {
                    arrayList.remove(size);
                    ((kd) ciVar.a).g(kcVar2);
                }
                if (kcVarB != null) {
                    arrayList.add(size, kcVarB);
                }
                if (kcVarB3 != null) {
                    arrayList.add(size, kcVarB3);
                }
            }
        }
        int size2 = arrayList.size();
        int i30 = 0;
        while (i30 < size2) {
            kc kcVarB4 = (kc) arrayList.get(i30);
            int i31 = kcVarB4.a;
            if (i31 == 1) {
                n(kcVarB4);
            } else if (i31 == 2) {
                int i32 = kcVarB4.b;
                int i33 = kcVarB4.d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (this.e.u(i34) != null || o(i34)) {
                        if (b2 == 0) {
                            m(b(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            n(b(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != kcVarB4.d) {
                    g(kcVarB4);
                    kcVarB4 = b(2, i32, i35, null);
                }
                if (b2 == 0) {
                    m(kcVarB4);
                } else {
                    n(kcVarB4);
                }
            } else if (i31 == 4) {
                int i36 = kcVarB4.b;
                int i37 = kcVarB4.d + i36;
                int i38 = i36;
                int i39 = 0;
                while (i36 < i37) {
                    if (this.e.u(i36) != null || o(i36)) {
                        if (i == 0) {
                            m(b(4, i38, i39, kcVarB4.c));
                            i38 = i36;
                            i39 = 0;
                        }
                        i = 1;
                    } else {
                        if (i == 1) {
                            n(b(4, i38, i39, kcVarB4.c));
                            i38 = i36;
                            i39 = 0;
                        }
                        i = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != kcVarB4.d) {
                    Object obj = kcVarB4.c;
                    g(kcVarB4);
                    kcVarB4 = b(4, i38, i39, obj);
                }
                if (i == 0) {
                    m(kcVarB4);
                } else {
                    n(kcVarB4);
                }
            } else if (i31 == 8) {
                n(kcVarB4);
            }
            i30++;
            i = -1;
        }
        arrayList.clear();
    }

    public final void g(kc kcVar) {
        kcVar.c = null;
        this.f.b(kcVar);
    }

    final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g((kc) list.get(i));
        }
        list.clear();
    }

    public final void i() {
        h(this.a);
        h(this.b);
        this.c = 0;
    }

    public final boolean j(int i) {
        return (this.c & i) != 0;
    }

    public final boolean k() {
        return this.a.size() > 0;
    }
}
