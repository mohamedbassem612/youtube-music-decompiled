package defpackage;

import android.graphics.PointF;
import android.util.SizeF;
import app.rive.semantics.SemanticState;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rar {
    protected final raq a;
    public boolean b = false;
    public boolean c = false;
    private final int d;
    private final qup e;

    protected rar(qup qupVar, int i, raq raqVar) {
        this.e = qupVar;
        this.d = i;
        this.a = raqVar;
    }

    public static boolean c(qup qupVar) {
        qus qusVar = qupVar.b;
        return (qusVar instanceof quu) && qusVar.b().isEmpty() && qusVar.g;
    }

    protected abstract atqv a(qup qupVar);

    public final atrg b(Duration duration) {
        aimr aimrVar;
        int i;
        qup qupVar = this.e;
        qus qusVar = qupVar.b;
        quu quuVar = (quu) qusVar;
        float fI = 1.0f - nrc.i(quuVar);
        aihf aihfVarCreateBuilder = atrg.a.createBuilder();
        atqv atqvVarA = a(qupVar);
        aihfVarCreateBuilder.copyOnWrite();
        atrg atrgVar = (atrg) aihfVarCreateBuilder.instance;
        atqvVarA.getClass();
        atrgVar.e = atqvVarA;
        atrgVar.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        atrg atrgVar2 = (atrg) aihfVarCreateBuilder.instance;
        atrgVar2.b |= 1;
        atrgVar2.c = this.d;
        raq raqVar = this.a;
        float height = raqVar.b().getHeight() / 2.0f;
        PointF pointF = new PointF(raqVar.b().getWidth() / 2.0f, height);
        if (qusVar instanceof quw) {
            aihf aihfVarCreateBuilder2 = aimr.a.createBuilder();
            aims aimsVar = aims.a;
            aihf aihfVarCreateBuilder3 = aimsVar.createBuilder();
            float width = raqVar.b().getWidth();
            aihfVarCreateBuilder3.copyOnWrite();
            aims aimsVar2 = (aims) aihfVarCreateBuilder3.instance;
            aimsVar2.b |= 1;
            aimsVar2.c = width;
            float height2 = raqVar.b().getHeight();
            aihfVarCreateBuilder3.copyOnWrite();
            aims aimsVar3 = (aims) aihfVarCreateBuilder3.instance;
            aimsVar3.b |= 2;
            aimsVar3.d = height2;
            aihfVarCreateBuilder2.copyOnWrite();
            aimr aimrVar2 = (aimr) aihfVarCreateBuilder2.instance;
            aims aimsVar4 = (aims) aihfVarCreateBuilder3.build();
            aimsVar4.getClass();
            aimrVar2.d = aimsVar4;
            aimrVar2.b |= 2;
            float radians = (float) Math.toRadians(nrc.j(quuVar));
            aihfVarCreateBuilder2.copyOnWrite();
            aimr aimrVar3 = (aimr) aihfVarCreateBuilder2.instance;
            aimrVar3.b |= 8;
            aimrVar3.e = radians;
            if (this.c) {
                aihf aihfVarCreateBuilder4 = aimsVar.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                aims aimsVar5 = (aims) aihfVarCreateBuilder4.instance;
                aimsVar5.b |= 1;
                aimsVar5.c = 0.0f;
                aihfVarCreateBuilder4.copyOnWrite();
                aims aimsVar6 = (aims) aihfVarCreateBuilder4.instance;
                aimsVar6.b |= 2;
                aimsVar6.d = 0.0f;
                aihfVarCreateBuilder2.copyOnWrite();
                aimr aimrVar4 = (aimr) aihfVarCreateBuilder2.instance;
                aims aimsVar7 = (aims) aihfVarCreateBuilder4.build();
                aimsVar7.getClass();
                aimrVar4.c = aimsVar7;
                aimrVar4.b |= 1;
            } else {
                aihf aihfVarCreateBuilder5 = aimsVar.createBuilder();
                float f = pointF.x;
                aihfVarCreateBuilder5.copyOnWrite();
                aims aimsVar8 = (aims) aihfVarCreateBuilder5.instance;
                aimsVar8.b |= 1;
                aimsVar8.c = f;
                float f2 = pointF.y;
                aihfVarCreateBuilder5.copyOnWrite();
                aims aimsVar9 = (aims) aihfVarCreateBuilder5.instance;
                aimsVar9.b |= 2;
                aimsVar9.d = f2;
                aihfVarCreateBuilder2.copyOnWrite();
                aimr aimrVar5 = (aimr) aihfVarCreateBuilder2.instance;
                aims aimsVar10 = (aims) aihfVarCreateBuilder5.build();
                aimsVar10.getClass();
                aimrVar5.c = aimsVar10;
                aimrVar5.b |= 1;
            }
            aimrVar = (aimr) aihfVarCreateBuilder2.build();
        } else {
            SizeF sizeFK = nrc.k(quuVar);
            double dJ = nrc.j(quuVar);
            PointF pointFL = nrc.l(quuVar);
            if (this.c) {
                aihf aihfVarCreateBuilder6 = aimr.a.createBuilder();
                aims aimsVar11 = aims.a;
                aihf aihfVarCreateBuilder7 = aimsVar11.createBuilder();
                float width2 = sizeFK.getWidth();
                aihfVarCreateBuilder7.copyOnWrite();
                aims aimsVar12 = (aims) aihfVarCreateBuilder7.instance;
                aimsVar12.b |= 1;
                aimsVar12.c = width2;
                float height3 = sizeFK.getHeight();
                aihfVarCreateBuilder7.copyOnWrite();
                aims aimsVar13 = (aims) aihfVarCreateBuilder7.instance;
                aimsVar13.b |= 2;
                aimsVar13.d = height3;
                aihfVarCreateBuilder6.copyOnWrite();
                aimr aimrVar6 = (aimr) aihfVarCreateBuilder6.instance;
                aims aimsVar14 = (aims) aihfVarCreateBuilder7.build();
                aimsVar14.getClass();
                aimrVar6.d = aimsVar14;
                aimrVar6.b |= 2;
                float radians2 = (float) Math.toRadians(dJ);
                aihfVarCreateBuilder6.copyOnWrite();
                aimr aimrVar7 = (aimr) aihfVarCreateBuilder6.instance;
                aimrVar7.b |= 8;
                aimrVar7.e = radians2;
                aihf aihfVarCreateBuilder8 = aimsVar11.createBuilder();
                float f3 = pointFL.x;
                aihfVarCreateBuilder8.copyOnWrite();
                aims aimsVar15 = (aims) aihfVarCreateBuilder8.instance;
                aimsVar15.b |= 1;
                aimsVar15.c = f3;
                float f4 = pointFL.y;
                aihfVarCreateBuilder8.copyOnWrite();
                aims aimsVar16 = (aims) aihfVarCreateBuilder8.instance;
                aimsVar16.b |= 2;
                aimsVar16.d = f4;
                aihfVarCreateBuilder6.copyOnWrite();
                aimr aimrVar8 = (aimr) aihfVarCreateBuilder6.instance;
                aims aimsVar17 = (aims) aihfVarCreateBuilder8.build();
                aimsVar17.getClass();
                aimrVar8.c = aimsVar17;
                aimrVar8.b |= 1;
                aimrVar = (aimr) aihfVarCreateBuilder6.build();
            } else {
                aihf aihfVarCreateBuilder9 = aimr.a.createBuilder();
                aims aimsVar18 = aims.a;
                aihf aihfVarCreateBuilder10 = aimsVar18.createBuilder();
                float f5 = pointF.x + (pointFL.x * height);
                aihfVarCreateBuilder10.copyOnWrite();
                aims aimsVar19 = (aims) aihfVarCreateBuilder10.instance;
                aimsVar19.b |= 1;
                aimsVar19.c = f5;
                float f6 = pointF.y + (pointFL.y * height);
                aihfVarCreateBuilder10.copyOnWrite();
                aims aimsVar20 = (aims) aihfVarCreateBuilder10.instance;
                aimsVar20.b |= 2;
                aimsVar20.d = f6;
                aihfVarCreateBuilder9.copyOnWrite();
                aimr aimrVar9 = (aimr) aihfVarCreateBuilder9.instance;
                aims aimsVar21 = (aims) aihfVarCreateBuilder10.build();
                aimsVar21.getClass();
                aimrVar9.c = aimsVar21;
                aimrVar9.b |= 1;
                aihf aihfVarCreateBuilder11 = aimsVar18.createBuilder();
                float width3 = sizeFK.getWidth();
                aihfVarCreateBuilder11.copyOnWrite();
                aims aimsVar22 = (aims) aihfVarCreateBuilder11.instance;
                aimsVar22.b |= 1;
                aimsVar22.c = width3;
                float height4 = sizeFK.getHeight();
                aihfVarCreateBuilder11.copyOnWrite();
                aims aimsVar23 = (aims) aihfVarCreateBuilder11.instance;
                aimsVar23.b |= 2;
                aimsVar23.d = height4;
                aihfVarCreateBuilder9.copyOnWrite();
                aimr aimrVar10 = (aimr) aihfVarCreateBuilder9.instance;
                aims aimsVar24 = (aims) aihfVarCreateBuilder11.build();
                aimsVar24.getClass();
                aimrVar10.d = aimsVar24;
                aimrVar10.b |= 2;
                float radians3 = (float) Math.toRadians(dJ);
                aihfVarCreateBuilder9.copyOnWrite();
                aimr aimrVar11 = (aimr) aihfVarCreateBuilder9.instance;
                aimrVar11.b |= 8;
                aimrVar11.e = radians3;
                aimrVar = (aimr) aihfVarCreateBuilder9.build();
            }
        }
        aihfVarCreateBuilder.copyOnWrite();
        atrg atrgVar3 = (atrg) aihfVarCreateBuilder.instance;
        aimrVar.getClass();
        atrgVar3.d = aimrVar;
        atrgVar3.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        atrg atrgVar4 = (atrg) aihfVarCreateBuilder.instance;
        atrgVar4.b |= 16;
        atrgVar4.f = fI;
        if (this.b) {
            long jA = ahbt.a(qupVar.c);
            aihfVarCreateBuilder.copyOnWrite();
            atrg atrgVar5 = (atrg) aihfVarCreateBuilder.instance;
            atrgVar5.b |= 32;
            atrgVar5.g = jA;
        }
        if (this.c) {
            aihfVarCreateBuilder.copyOnWrite();
            atrg atrgVar6 = (atrg) aihfVarCreateBuilder.instance;
            atrgVar6.b |= SemanticState.Hidden;
            atrgVar6.i = true;
            int i2 = quuVar.j;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                i = 2;
            } else {
                if (i3 != 1) {
                    throw new RuntimeException(null, null);
                }
                i = 3;
            }
            aihfVarCreateBuilder.copyOnWrite();
            atrg atrgVar7 = (atrg) aihfVarCreateBuilder.instance;
            atrgVar7.j = i - 1;
            atrgVar7.b |= SemanticState.LiveRegion;
            aihf aihfVarCreateBuilder12 = atrk.a.createBuilder();
            float f7 = quuVar.i.left;
            aihfVarCreateBuilder12.copyOnWrite();
            atrk atrkVar = (atrk) aihfVarCreateBuilder12.instance;
            atrkVar.b |= 1;
            atrkVar.c = f7;
            float f8 = quuVar.i.top;
            aihfVarCreateBuilder12.copyOnWrite();
            atrk atrkVar2 = (atrk) aihfVarCreateBuilder12.instance;
            atrkVar2.b |= 2;
            atrkVar2.d = f8;
            float f9 = quuVar.i.right;
            aihfVarCreateBuilder12.copyOnWrite();
            atrk atrkVar3 = (atrk) aihfVarCreateBuilder12.instance;
            atrkVar3.b |= 4;
            atrkVar3.e = f9;
            float f10 = quuVar.i.bottom;
            aihfVarCreateBuilder12.copyOnWrite();
            atrk atrkVar4 = (atrk) aihfVarCreateBuilder12.instance;
            atrkVar4.b |= 8;
            atrkVar4.f = f10;
            atrk atrkVar5 = (atrk) aihfVarCreateBuilder12.build();
            aihfVarCreateBuilder.copyOnWrite();
            atrg atrgVar8 = (atrg) aihfVarCreateBuilder.instance;
            atrkVar5.getClass();
            atrgVar8.h = atrkVar5;
            atrgVar8.b |= SemanticState.Focused;
        }
        return (atrg) aihfVarCreateBuilder.build();
    }
}
