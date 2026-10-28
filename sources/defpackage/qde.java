package defpackage;

import android.os.Build;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qde implements qda {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public qde(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v32, types: [awmd, java.lang.Object] */
    @Override // defpackage.qda
    public final boolean a(aihf aihfVar) {
        int i = this.$cid;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            aihf aihfVarCreateBuilder = qct.a.createBuilder();
            aihf aihfVarCreateBuilder2 = qcu.a.createBuilder();
            Object obj = this.a;
            long startElapsedRealtime = Process.getStartElapsedRealtime();
            qdd qddVar = (qdd) obj;
            mbc mbcVar = qddVar.a;
            aijp aijpVarB = aikz.b(mbcVar.f().toEpochMilli() - (mbcVar.b() - startElapsedRealtime));
            aihfVarCreateBuilder2.copyOnWrite();
            qcu qcuVar = (qcu) aihfVarCreateBuilder2.instance;
            aijpVarB.getClass();
            qcuVar.c = aijpVarB;
            qcuVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            qct qctVar = (qct) aihfVarCreateBuilder.instance;
            qcu qcuVar2 = (qcu) aihfVarCreateBuilder2.build();
            qcuVar2.getClass();
            qctVar.c = qcuVar2;
            qctVar.b = 2;
            aihfVar.copyOnWrite();
            qcx qcxVar = (qcx) aihfVar.instance;
            qct qctVar2 = (qct) aihfVarCreateBuilder.build();
            qcx qcxVar2 = qcx.a;
            qctVar2.getClass();
            qcxVar.a();
            qcxVar.e.add(qctVar2);
            if (!((Boolean) qddVar.b.io()).booleanValue()) {
                long jMyPid = Process.myPid();
                aihfVar.copyOnWrite();
                qcx qcxVar3 = (qcx) aihfVar.instance;
                qcxVar3.b |= 1;
                qcxVar3.c = jMyPid;
                aijp aijpVarB2 = aikz.b(mbcVar.f().toEpochMilli());
                aihfVar.copyOnWrite();
                qcx qcxVar4 = (qcx) aihfVar.instance;
                aijpVarB2.getClass();
                qcxVar4.d = aijpVarB2;
                qcxVar4.b |= 2;
            }
        } else {
            if (i != 2) {
                ((Boolean) ((oml) this.a).a.io()).booleanValue();
                return false;
            }
            aihf aihfVarCreateBuilder3 = qcw.a.createBuilder();
            qdh qdhVar = (qdh) this.a;
            awmd awmdVar = qdhVar.a;
            if (awmdVar.io() != null) {
                String str = (String) awmdVar.io();
                aihfVarCreateBuilder3.copyOnWrite();
                qcw qcwVar = (qcw) aihfVarCreateBuilder3.instance;
                str.getClass();
                qcwVar.b |= 1;
                qcwVar.c = str;
            }
            awmd awmdVar2 = qdhVar.b;
            if (((Integer) awmdVar2.io()).intValue() > 0) {
                int iIntValue = ((Integer) awmdVar2.io()).intValue();
                aihfVarCreateBuilder3.copyOnWrite();
                qcw qcwVar2 = (qcw) aihfVarCreateBuilder3.instance;
                qcwVar2.b |= 2;
                qcwVar2.d = iIntValue;
            }
            awmd awmdVar3 = qdhVar.c;
            if (((Integer) awmdVar3.io()).intValue() > 0) {
                int iIntValue2 = ((Integer) awmdVar3.io()).intValue();
                aihfVarCreateBuilder3.copyOnWrite();
                qcw qcwVar3 = (qcw) aihfVarCreateBuilder3.instance;
                qcwVar3.b |= 4;
                qcwVar3.e = iIntValue2;
            }
            int i2 = Build.VERSION.SDK_INT;
            aihfVarCreateBuilder3.copyOnWrite();
            qcw qcwVar4 = (qcw) aihfVarCreateBuilder3.instance;
            qcwVar4.b |= 8;
            qcwVar4.f = i2;
            aihf aihfVarCreateBuilder4 = qct.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            qct qctVar3 = (qct) aihfVarCreateBuilder4.instance;
            qcw qcwVar5 = (qcw) aihfVarCreateBuilder3.build();
            qcwVar5.getClass();
            qctVar3.c = qcwVar5;
            qctVar3.b = 4;
            qct qctVar4 = (qct) aihfVarCreateBuilder4.build();
            aihfVar.copyOnWrite();
            qcx qcxVar5 = (qcx) aihfVar.instance;
            qcx qcxVar6 = qcx.a;
            qctVar4.getClass();
            qcxVar5.a();
            qcxVar5.e.add(qctVar4);
        }
        return true;
    }
}
