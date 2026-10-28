package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ari {
    static final boolean[] a = new boolean[3];

    static void a(are areVar, aqu aquVar, ard ardVar) {
        ardVar.p = -1;
        ardVar.q = -1;
        int[] iArr = areVar.aq;
        if (iArr[0] != 2 && ardVar.aq[0] == 4) {
            arc arcVar = ardVar.J;
            int i = arcVar.f;
            int iJ = areVar.j();
            arc arcVar2 = ardVar.L;
            int i2 = iJ - arcVar2.f;
            arcVar.h = aquVar.b(arcVar);
            arcVar2.h = aquVar.b(arcVar2);
            aquVar.f(arcVar.h, i);
            aquVar.f(arcVar2.h, i2);
            ardVar.p = 2;
            ardVar.Z = i;
            int i3 = i2 - i;
            ardVar.V = i3;
            int i4 = ardVar.ac;
            if (i3 < i4) {
                ardVar.V = i4;
            }
        }
        if (iArr[1] == 2 || ardVar.aq[1] != 4) {
            return;
        }
        arc arcVar3 = ardVar.K;
        int i5 = arcVar3.f;
        int iH = areVar.h();
        arc arcVar4 = ardVar.M;
        int i6 = iH - arcVar4.f;
        arcVar3.h = aquVar.b(arcVar3);
        arcVar4.h = aquVar.b(arcVar4);
        aquVar.f(arcVar3.h, i5);
        aquVar.f(arcVar4.h, i6);
        if (ardVar.ab > 0 || ardVar.ah == 8) {
            arc arcVar5 = ardVar.N;
            arcVar5.h = aquVar.b(arcVar5);
            aquVar.f(arcVar5.h, ardVar.ab + i5);
        }
        ardVar.q = 2;
        ardVar.aa = i5;
        int i7 = i6 - i5;
        ardVar.W = i7;
        int i8 = ardVar.ad;
        if (i7 < i8) {
            ardVar.W = i8;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
