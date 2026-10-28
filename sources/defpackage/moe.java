package defpackage;

import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class moe {
    public final ArrayList d;
    moe e;
    public moh f;
    public int a = 0;
    public int b = 0;
    private int h = 0;
    public int c = 0;
    private int i = 0;
    public boolean g = false;

    public moe() {
        if (FlowLayoutManager.j) {
            this.d = new ArrayList(1);
        } else {
            this.d = new ArrayList();
        }
        this.f = new moh();
    }

    static final int l(moi moiVar) {
        boolean z = moiVar.e;
        return moiVar.b;
    }

    private static final int o(moi moiVar, mod modVar, View view) {
        if (FlowLayoutManager.p && view.getVisibility() == 8) {
            return 0;
        }
        nd ndVar = moiVar.o;
        ndVar.getClass();
        int iC = modVar.j;
        if (iC == -1) {
            iC = ndVar.c(view);
        }
        boolean z = moiVar.h;
        return iC;
    }

    public final int a() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return -1;
        }
        return ((mod) aguu.K(arrayList)).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r6 == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r3 - r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.moi r4, defpackage.mod r5, int r6) {
        /*
            r3 = this;
            nd r0 = r4.o
            r0.getClass()
            boolean r1 = r4.d
            if (r1 == 0) goto Lc
            int r3 = r3.b
            goto Le
        Lc:
            int r3 = r3.a
        Le:
            r0.getClass()
            android.view.View r1 = r5.i
            r1.getClass()
            int r5 = r5.h
            r2 = -1
            if (r5 != r2) goto L1f
            int r5 = r0.b(r1)
        L1f:
            int r4 = r4.r
            int r0 = r4 + (-1)
            if (r4 == 0) goto L37
            r4 = 1
            if (r0 == r4) goto L31
            r4 = 2
            if (r0 == r4) goto L2e
            int r3 = r3 - r5
            int r3 = r3 / r4
            goto L36
        L2e:
            if (r6 != r2) goto L33
            goto L35
        L31:
            if (r6 != r2) goto L35
        L33:
            int r3 = r3 - r5
            goto L36
        L35:
            r3 = 0
        L36:
            return r3
        L37:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moe.b(moi, mod, int):int");
    }

    public final void c(moi moiVar, mom momVar, FlowLayoutManager flowLayoutManager, boolean z, boolean z2) {
        d(moiVar, momVar, flowLayoutManager, z, z2);
        moiVar.i.b(this);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    public final void d(moi moiVar, mom momVar, FlowLayoutManager flowLayoutManager, boolean z, boolean z2) {
        ArrayList arrayList;
        FlowLayoutManager flowLayoutManager2;
        int iB;
        int i;
        int i2;
        int iB2;
        int iB3;
        int width;
        int iB4;
        int i3;
        nd ndVar;
        moe moeVarD;
        int i4;
        nd ndVar2 = moiVar.o;
        ndVar2.getClass();
        int i5 = 0;
        if (FlowLayoutManager.p) {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.d;
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                mod modVar = (mod) arrayList2.get(i6);
                View view = modVar.i;
                if (view != null && view.getVisibility() != 8) {
                    arrayList.add(modVar);
                }
            }
        } else {
            arrayList = this.d;
        }
        if (momVar.e == -1 && !moiVar.d) {
            Collections.reverse(this.d);
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3.isEmpty()) {
            return;
        }
        int i7 = 1;
        if (arrayList.size() <= 1 || moiVar.c != -1) {
            flowLayoutManager2 = flowLayoutManager;
            this.i = (!FlowLayoutManager.p || arrayList.size() > 1) ? l(moiVar) : 0;
        } else {
            boolean z3 = moiVar.e;
            flowLayoutManager2 = flowLayoutManager;
            int iA = moiVar.a(flowLayoutManager2);
            int size2 = arrayList.size();
            if (!FlowLayoutManager.p) {
                size2 = arrayList3.size();
            }
            int i8 = size2 - 1;
            if (i8 > 0) {
                this.i = (int) Math.floor((iA - this.c) / i8);
                int iL = l(moiVar);
                if (this.i < iL) {
                    this.i = iL;
                }
            } else {
                this.i = 0;
            }
        }
        if (z2 && (moeVarD = moiVar.d(((mod) arrayList3.get(0)).a - 1)) != null) {
            ArrayList arrayList4 = moeVarD.d;
            ahno.O(!arrayList4.isEmpty());
            if (arrayList4.size() > arrayList3.size() && (i4 = moeVarD.i) > 0) {
                this.i = i4;
            }
        }
        int iA2 = moiVar.d ? this.f.a(z, moiVar.p) : 0;
        boolean z4 = moiVar.f;
        int paddingRight = (moiVar.p == 1 ? z ? flowLayoutManager2.getPaddingRight() : flowLayoutManager2.getPaddingLeft() : flowLayoutManager2.getPaddingTop()) + iA2;
        this.b = 0;
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            mod modVar2 = (mod) arrayList3.get(i9);
            int i10 = i9;
            View view2 = modVar2.i;
            view2.getClass();
            if (moiVar.d && modVar2.f && (ndVar = moiVar.o) != null) {
                if (moiVar.p == i7) {
                    int iB5 = ndVar.b(view2);
                    int i11 = modVar2.e - modVar2.c;
                    int iC = moiVar.o.c(view2);
                    int i12 = modVar2.d - modVar2.b;
                    if (iB5 != i11 || iC != i12) {
                        flowLayoutManager2.j(view2, modVar2, this.f, -1, -1);
                    }
                } else {
                    int iB6 = ndVar.b(view2);
                    int i13 = modVar2.d - modVar2.b;
                    if (moiVar.o.c(view2) != modVar2.e - modVar2.c || iB6 != i13) {
                        flowLayoutManager2.j(view2, modVar2, this.f, -1, -1);
                    }
                }
            }
            if (FlowLayoutManager.p && view2.getVisibility() == 8) {
                i3 = 0;
                modVar2.h = 0;
                modVar2.j = 0;
            } else {
                i3 = 0;
                modVar2.h = ndVar2.b(view2);
                modVar2.j = ndVar2.c(view2);
            }
            this.b = Math.max(modVar2.h, this.b);
            i9 = i10 + 1;
            flowLayoutManager2 = flowLayoutManager;
            i5 = i3;
            i7 = 1;
        }
        int i14 = i5;
        this.a = this.b;
        int size4 = arrayList3.size();
        int i15 = i14;
        while (i15 < size4) {
            mod modVar3 = (mod) arrayList3.get(i15);
            View view3 = modVar3.i;
            view3.getClass();
            int iC2 = modVar3.j;
            if (iC2 == -1) {
                iC2 = ndVar2.c(view3);
            }
            int iO = o(moiVar, modVar3, view3) + ((FlowLayoutManager.p && view3.getVisibility() == 8) ? i14 : this.i) + paddingRight;
            if (moiVar.p == 1) {
                if (z) {
                    width = flowLayoutManager.getWidth() - paddingRight;
                    paddingRight = width - iC2;
                } else {
                    width = paddingRight + iC2;
                }
                int i16 = momVar.f;
                if (i16 == -1) {
                    if (moiVar.d) {
                        boolean z5 = moiVar.g;
                        if (this.g) {
                            boolean z6 = moiVar.e;
                        }
                        iB = (momVar.b - b(moiVar, modVar3, -1)) - this.f.c;
                    } else {
                        iB = (momVar.b - b(moiVar, modVar3, -1)) - moiVar.a;
                    }
                    iB4 = iB - modVar3.h;
                } else {
                    iB4 = momVar.b + b(moiVar, modVar3, i16);
                    iB = modVar3.h + iB4;
                }
                i = paddingRight;
                paddingRight = iB4;
                i2 = width;
            } else {
                iB = iC2 + paddingRight;
                int i17 = momVar.f;
                if (i17 == -1) {
                    if (momVar.e != -1) {
                        iB2 = momVar.b;
                        iB3 = b(moiVar, modVar3, -1);
                    } else if (moiVar.d) {
                        iB2 = momVar.b - b(moiVar, modVar3, -1);
                        iB3 = this.f.c;
                    } else {
                        iB2 = momVar.b - b(moiVar, modVar3, -1);
                        iB3 = moiVar.a;
                    }
                    i2 = iB2 - iB3;
                    i = i2 - modVar3.h;
                } else {
                    int iB7 = b(moiVar, modVar3, i17) + momVar.b;
                    i = iB7;
                    i2 = modVar3.h + iB7;
                }
            }
            modVar3.a(i, paddingRight, i2, iB);
            flowLayoutManager.layoutDecoratedWithMargins(view3, i, paddingRight, i2, iB);
            i15++;
            paddingRight = iO;
            i14 = 0;
        }
        if (moiVar.d) {
            m(moiVar, z2);
        } else {
            this.a += z2 ? 0 : moiVar.a;
        }
    }

    public final void e() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mod) arrayList.get(i)).i = null;
        }
        moe moeVar = this.e;
        if (moeVar != null) {
            moeVar.e();
        }
    }

    final void f() {
        this.a = 0;
        this.b = 0;
        this.h = 0;
        this.c = 0;
        this.d.clear();
        this.i = 0;
        this.e = null;
        this.g = false;
    }

    public final void g(mol molVar) {
        molVar.a = this.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    public final boolean h(moi moiVar, mod modVar, np npVar, mom momVar, boolean z) {
        int iA;
        int i;
        int i2;
        boolean zIsEmpty;
        moh mohVar;
        boolean z2 = moiVar.h;
        int i3 = modVar.g;
        if (FlowLayoutManager.e && (mohVar = this.f) != null && mohVar.e == 1) {
            zIsEmpty = this.d.isEmpty();
        } else {
            int i4 = modVar.a;
            if (momVar.e != -1) {
                iA = this.f.a(z, moiVar.p);
                i = this.h;
                if (i == 0) {
                    this.h = iA;
                } else {
                    i2 = i + i3;
                    moiVar.o.getClass();
                    boolean z3 = moiVar.e;
                    if (i2 <= iA + moiVar.a(npVar)) {
                        zIsEmpty = false;
                    }
                }
                zIsEmpty = true;
            } else {
                if (this.d.isEmpty() && this.e == null) {
                    this.e = moiVar.d(i4);
                }
                moe moeVar = this.e;
                if (moeVar != null) {
                    ArrayList arrayList = moeVar.d;
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            int i6 = ((mod) arrayList.get(i5)).a;
                            i5++;
                            if (i6 == i4) {
                                zIsEmpty = true;
                            }
                        } else {
                            zIsEmpty = false;
                        }
                    }
                } else {
                    iA = this.f.a(z, moiVar.p);
                    i = this.h;
                    if (i == 0) {
                        this.h = iA;
                    } else {
                        i2 = i + i3;
                        moiVar.o.getClass();
                        boolean z4 = moiVar.e;
                        if (i2 <= iA + moiVar.a(npVar)) {
                            zIsEmpty = false;
                        }
                    }
                    zIsEmpty = true;
                }
            }
        }
        if (!zIsEmpty) {
            return false;
        }
        moiVar.o.getClass();
        this.c += i3;
        int i7 = this.h + i3;
        this.h = i7;
        this.h = i7 + this.f.b;
        modVar.k = true;
        this.d.add(modVar);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    public final boolean i(moi moiVar, View view, mod modVar, np npVar, mom momVar, boolean z) {
        int iA;
        int iO;
        boolean zIsEmpty;
        moe moeVarD;
        int i;
        int i2;
        int i3;
        moh mohVar;
        if (FlowLayoutManager.e && (mohVar = this.f) != null && mohVar.e == 1) {
            zIsEmpty = this.d.isEmpty();
        } else if (momVar.e == -1) {
            int position = npVar.getPosition(view);
            if (this.d.isEmpty() && this.e == null) {
                this.e = moiVar.d(position);
            }
            moe moeVar = this.e;
            if (moeVar != null) {
                ArrayList arrayList = moeVar.d;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        int i5 = ((mod) arrayList.get(i4)).a;
                        i4++;
                        if (i5 == position) {
                            zIsEmpty = true;
                        }
                    } else {
                        zIsEmpty = false;
                    }
                }
            } else {
                if (moiVar.d) {
                    iA = this.f.a(z, moiVar.p);
                } else {
                    iA = 0;
                }
                if (this.h == 0) {
                    this.h = iA;
                } else {
                    moiVar.o.getClass();
                    iO = o(moiVar, modVar, view);
                    boolean z2 = moiVar.e;
                    if (this.h + iO <= iA + moiVar.a(npVar)) {
                        zIsEmpty = false;
                    }
                }
                zIsEmpty = true;
            }
        } else {
            if (moiVar.d) {
                iA = this.f.a(z, moiVar.p);
            } else {
                iA = 0;
            }
            if (this.h == 0) {
                this.h = iA;
            } else {
                moiVar.o.getClass();
                iO = o(moiVar, modVar, view);
                boolean z3 = moiVar.e;
                if (this.h + iO <= iA + moiVar.a(npVar)) {
                    zIsEmpty = false;
                }
            }
            zIsEmpty = true;
        }
        if (!zIsEmpty) {
            return false;
        }
        int i6 = modVar.a;
        ArrayList arrayList2 = this.d;
        if (arrayList2.isEmpty() && momVar.f == -1 && (moeVarD = moiVar.d(i6)) != null) {
            ArrayList arrayList3 = moeVarD.d;
            ahno.O(!arrayList3.isEmpty());
            mod modVar2 = (mod) aguu.K(arrayList3);
            nd ndVar = moiVar.o;
            ndVar.getClass();
            int iC = ndVar.c(view);
            if (modVar2.f) {
                if (moiVar.p == 1) {
                    i2 = modVar2.d;
                    i3 = modVar2.b;
                } else {
                    i2 = modVar2.e;
                    i3 = modVar2.c;
                }
                i = i2 - i3;
            } else {
                int i7 = modVar2.j;
                i = (i7 == -1 && (i7 = modVar2.g) == -1) ? 0 : i7;
            }
            if (iC == i) {
                if (moiVar.p != 1) {
                    this.h = (npVar.getHeight() - npVar.getPaddingBottom()) - modVar2.e;
                } else if (z) {
                    this.h = (npVar.getWidth() - npVar.getPaddingLeft()) - modVar2.b;
                } else {
                    this.h = (npVar.getWidth() - npVar.getPaddingRight()) - modVar2.d;
                }
            }
        }
        int iO2 = o(moiVar, modVar, view);
        nd ndVar2 = moiVar.o;
        ndVar2.getClass();
        int iB = (FlowLayoutManager.p && view.getVisibility() == 8) ? 0 : ndVar2.b(view);
        modVar.h = iB;
        modVar.j = (FlowLayoutManager.p && view.getVisibility() == 8) ? 0 : ndVar2.c(view);
        this.c += iO2;
        this.h += iO2;
        if (!FlowLayoutManager.p || view.getVisibility() != 8) {
            boolean z4 = moiVar.d;
            int i8 = this.h;
            if (z4) {
                this.h = i8 + this.f.b;
            } else {
                this.h = i8 + moiVar.b;
            }
        }
        this.a = Math.max(iB, this.a);
        this.b = Math.max(iB, this.b);
        arrayList2.add(modVar);
        return true;
    }

    public final boolean j(moi moiVar, np npVar, Boolean bool) {
        int iA = moiVar.a(npVar);
        boolean z = moiVar.d;
        int i = this.h;
        if (z) {
            if (i == this.f.a(bool.booleanValue(), moiVar.p) + iA) {
                return true;
            }
        } else if (i == iA) {
            return true;
        }
        return false;
    }

    public final void k() {
        this.g = true;
    }

    public final void m(moi moiVar, boolean z) {
        moh mohVar = this.f;
        int iB = 0;
        if (mohVar.d != null) {
            boolean z2 = moiVar.e;
            if (this.g && !z) {
                iB = mohVar.b(moiVar.p);
            }
        }
        boolean z3 = moiVar.g;
        if (!this.g) {
            iB = this.f.c;
        }
        int i = this.a;
        if (i == this.b) {
            this.a = i + iB;
        }
    }

    public final boolean n(moi moiVar, View view, int i, np npVar, mom momVar, boolean z) {
        return i(moiVar, view, new mod(view, i, -1, 3), npVar, momVar, z);
    }

    public moe(moh mohVar) {
        if (FlowLayoutManager.j) {
            int i = mohVar.e;
            this.d = new ArrayList(i <= 0 ? 1 : i);
        } else {
            this.d = new ArrayList();
        }
        this.f = mohVar;
    }
}
