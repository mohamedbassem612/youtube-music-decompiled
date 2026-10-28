package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejj extends eix {
    public List e;
    private final ekx f;
    private final Path g;
    private Path h;
    private Path i;

    public ejj(List list) {
        super(list);
        this.f = new ekx();
        this.g = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0389  */
    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        ekx ekxVar;
        ekx ekxVar2;
        ekx ekxVar3;
        ekx ekxVar4;
        ekx ekxVar5;
        int i;
        ekx ekxVar6;
        ekx ekxVar7;
        int i2;
        PointF pointF;
        PointF pointF2;
        ekx ekxVar8;
        ekx ekxVar9 = (ekx) ennVar.b;
        ekx ekxVar10 = (ekx) ennVar.c;
        ekx ekxVar11 = ekxVar10 == null ? ekxVar9 : ekxVar10;
        ekx ekxVar12 = this.f;
        if (ekxVar12.b == null) {
            ekxVar12.b = new PointF();
        }
        ekxVar12.c = ekxVar9.c || ekxVar11.c;
        List list = ekxVar9.a;
        int size = list.size();
        List list2 = ekxVar11.a;
        if (size != list2.size()) {
            ((end) ene.a).a("Curves must have the same number of control points. Shape 1: " + list.size() + "\tShape 2: " + list2.size(), null);
        }
        int iMin = Math.min(list.size(), list2.size());
        List list3 = ekxVar12.a;
        if (list3.size() < iMin) {
            for (int size2 = list3.size(); size2 < iMin; size2++) {
                list3.add(new ejr());
            }
        } else if (list3.size() > iMin) {
            int size3 = list3.size();
            while (true) {
                size3--;
                if (size3 < iMin) {
                    break;
                }
                list3.remove(list3.size() - 1);
            }
        }
        PointF pointF3 = ekxVar9.b;
        PointF pointF4 = ekxVar11.b;
        float f2 = pointF3.x;
        float f3 = pointF4.x;
        int i3 = enh.a;
        float f4 = pointF3.y;
        ekxVar12.a(f2 + ((f3 - f2) * f), f4 + ((pointF4.y - f4) * f));
        int size4 = list3.size() - 1;
        while (size4 >= 0) {
            ejr ejrVar = (ejr) list.get(size4);
            ejr ejrVar2 = (ejr) list2.get(size4);
            PointF pointF5 = ejrVar.a;
            PointF pointF6 = ejrVar.b;
            PointF pointF7 = ejrVar.c;
            PointF pointF8 = ejrVar2.a;
            PointF pointF9 = ejrVar2.b;
            PointF pointF10 = ejrVar2.c;
            ejr ejrVar3 = (ejr) list3.get(size4);
            ekx ekxVar13 = ekxVar12;
            float f5 = pointF5.x;
            float f6 = f5 + ((pointF8.x - f5) * f);
            float f7 = pointF5.y;
            ejrVar3.a(f6, f7 + ((pointF8.y - f7) * f));
            ejr ejrVar4 = (ejr) list3.get(size4);
            float f8 = pointF6.x;
            float f9 = f8 + ((pointF9.x - f8) * f);
            float f10 = pointF6.y;
            ejrVar4.b(f9, f10 + ((pointF9.y - f10) * f));
            ejr ejrVar5 = (ejr) list3.get(size4);
            float f11 = pointF7.x;
            float f12 = f11 + ((pointF10.x - f11) * f);
            float f13 = pointF7.y;
            ejrVar5.c(f12, f13 + ((pointF10.y - f13) * f));
            size4--;
            ekxVar12 = ekxVar13;
        }
        ekx ekxVar14 = ekxVar12;
        List list4 = this.e;
        if (list4 != null) {
            int size5 = list4.size() - 1;
            ekx ekxVar15 = ekxVar14;
            while (size5 >= 0) {
                eio eioVar = (eio) this.e.get(size5);
                List list5 = ekxVar15.a;
                if (list5.size() > 2) {
                    float fFloatValue = ((Float) eioVar.a.e()).floatValue();
                    if (fFloatValue != 0.0f) {
                        boolean z = ekxVar15.c;
                        int size6 = list5.size() - 1;
                        int i4 = 0;
                        while (size6 >= 0) {
                            ejr ejrVar6 = (ejr) list5.get(size6);
                            int i5 = size6 - 1;
                            int size7 = list5.size();
                            ejr ejrVar7 = (ejr) list5.get(i5 - (eio.a(i5, size7) * size7));
                            PointF pointF11 = (size6 != 0 || z) ? ejrVar7.c : ekxVar15.b;
                            int i6 = size5;
                            i4 = (((size6 != 0 || z) ? ejrVar7.b : pointF11).equals(pointF11) && ejrVar6.a.equals(pointF11) && !(!ekxVar15.c && (size6 == 0 || size6 == list5.size() + (-1)))) ? i4 + 2 : i4 + 1;
                            size6 = i5;
                            size5 = i6;
                        }
                        i = size5;
                        ekx ekxVar16 = eioVar.b;
                        if (ekxVar16 == null || ekxVar16.a.size() != i4) {
                            ArrayList arrayList = new ArrayList(i4);
                            for (int i7 = 0; i7 < i4; i7++) {
                                arrayList.add(new ejr());
                            }
                            i2 = 0;
                            eioVar.b = new ekx(new PointF(0.0f, 0.0f), false, arrayList);
                        } else {
                            i2 = 0;
                        }
                        ekx ekxVar17 = eioVar.b;
                        ekxVar17.c = z;
                        ekxVar17.a(ekxVar15.b.x, ekxVar15.b.y);
                        List list6 = ekxVar17.a;
                        boolean z2 = ekxVar15.c;
                        int i8 = i2;
                        int i9 = i8;
                        while (i8 < list5.size()) {
                            int i10 = i9 + 1;
                            int i11 = i9 - 1;
                            ejr ejrVar8 = (ejr) list5.get(i8);
                            int i12 = i8 - 1;
                            float f14 = fFloatValue;
                            int size8 = list5.size();
                            ejr ejrVar9 = (ejr) list5.get(i12 - (eio.a(i12, size8) * size8));
                            int i13 = i8 - 2;
                            boolean z3 = z2;
                            int size9 = list5.size();
                            ejr ejrVar10 = (ejr) list5.get(i13 - (eio.a(i13, size9) * size9));
                            if (i8 != 0) {
                                pointF = ejrVar9.c;
                            } else if (z3) {
                                i8 = 0;
                                pointF = ejrVar9.c;
                            } else {
                                pointF = ekxVar15.b;
                                i8 = 0;
                            }
                            if (i8 != 0) {
                                pointF2 = ejrVar9.b;
                            } else if (z3) {
                                i8 = 0;
                                pointF2 = ejrVar9.b;
                            } else {
                                pointF2 = pointF;
                                i8 = 0;
                            }
                            PointF pointF12 = ejrVar8.a;
                            PointF pointF13 = ejrVar10.c;
                            PointF pointF14 = ejrVar8.c;
                            ekx ekxVar18 = ekxVar10;
                            boolean z4 = !ekxVar15.c && (i8 == 0 || i8 == list5.size() + (-1));
                            if (pointF2.equals(pointF) && pointF12.equals(pointF) && !z4) {
                                float f15 = pointF.x - pointF13.x;
                                float f16 = pointF.y - pointF13.y;
                                float f17 = pointF14.x - pointF.x;
                                float f18 = pointF14.y - pointF.y;
                                ekx ekxVar19 = ekxVar17;
                                float fHypot = (float) Math.hypot(f15, f16);
                                float fHypot2 = (float) Math.hypot(f17, f18);
                                float fMin = Math.min(f14 / fHypot, 0.5f);
                                float fMin2 = Math.min(f14 / fHypot2, 0.5f);
                                float f19 = pointF.x + ((pointF13.x - pointF.x) * fMin);
                                float f20 = pointF.y + ((pointF13.y - pointF.y) * fMin);
                                float f21 = pointF.x + ((pointF14.x - pointF.x) * fMin2);
                                float f22 = pointF.y + ((pointF14.y - pointF.y) * fMin2);
                                float f23 = f19 - pointF.x;
                                float f24 = f20 - pointF.y;
                                float f25 = f21 - pointF.x;
                                float f26 = f22 - pointF.y;
                                int size10 = list6.size();
                                ejr ejrVar11 = (ejr) list6.get(i11 - (eio.a(i11, size10) * size10));
                                ejr ejrVar12 = (ejr) list6.get(i9);
                                ejrVar11.b(f19, f20);
                                ejrVar11.c(f19, f20);
                                if (i8 == 0) {
                                    ekxVar19.a(f19, f20);
                                }
                                ejrVar12.a(f19 - (f23 * 0.5519f), f20 - (f24 * 0.5519f));
                                ejr ejrVar13 = (ejr) list6.get(i10);
                                ejrVar12.b(f21 - (f25 * 0.5519f), f22 - (f26 * 0.5519f));
                                ejrVar12.c(f21, f22);
                                ejrVar13.a(f21, f22);
                                i9 += 2;
                                ekxVar8 = ekxVar19;
                            } else {
                                ekxVar8 = ekxVar17;
                                int size11 = list6.size();
                                ejr ejrVar14 = (ejr) list6.get(i11 - (eio.a(i11, size11) * size11));
                                ejr ejrVar15 = (ejr) list6.get(i9);
                                PointF pointF15 = ejrVar9.b;
                                ejrVar14.b(pointF15.x, pointF15.y);
                                PointF pointF16 = ejrVar9.c;
                                ejrVar14.c(pointF16.x, pointF16.y);
                                ejrVar15.a(pointF12.x, pointF12.y);
                                i9 = i10;
                            }
                            i8++;
                            ekxVar9 = ekxVar9;
                            fFloatValue = f14;
                            z2 = z3;
                            list5 = list5;
                            ekxVar10 = ekxVar18;
                            ekxVar15 = ekxVar15;
                            ekxVar17 = ekxVar8;
                        }
                        ekxVar7 = ekxVar9;
                        ekxVar5 = ekxVar10;
                        ekxVar6 = ekxVar17;
                    } else {
                        ekxVar5 = ekxVar10;
                        i = size5;
                        ekxVar6 = ekxVar15;
                        ekxVar7 = ekxVar9;
                    }
                } else {
                    ekxVar5 = ekxVar10;
                    i = size5;
                    ekxVar6 = ekxVar15;
                    ekxVar7 = ekxVar9;
                }
                size5 = i - 1;
                ekxVar9 = ekxVar7;
                ekxVar10 = ekxVar5;
                ekxVar15 = ekxVar6;
            }
            ekxVar = ekxVar15;
            ekxVar3 = ekxVar10;
            ekxVar2 = ekxVar9;
        } else {
            ekxVar = ekxVar14;
            ekxVar2 = ekxVar9;
            ekxVar3 = ekxVar10;
        }
        Path path = this.g;
        enh.c(ekxVar, path);
        if (this.d == null) {
            return path;
        }
        if (this.h == null) {
            this.h = new Path();
            this.i = new Path();
        }
        enh.c(ekxVar2, this.h);
        if (ekxVar3 != null) {
            ekxVar4 = ekxVar3;
            enh.c(ekxVar4, this.i);
        } else {
            ekxVar4 = ekxVar3;
        }
        enp enpVar = this.d;
        float f27 = ennVar.g;
        float fFloatValue2 = ennVar.h.floatValue();
        Path path2 = this.h;
        return (Path) enpVar.b(f27, fFloatValue2, path2, ekxVar4 == null ? path2 : this.i, f, c(), this.c);
    }
}
