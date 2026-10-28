package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zuj {
    static final int[] a = {1, 2, 3, 4, 5, 7, 10, 15, 20, 30};
    final aihf b = akkr.a.createBuilder();

    static int a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i <= iArr[i2]) {
                return i2;
            }
        }
        return 10;
    }

    final void b() {
        aihf aihfVar = this.b;
        long j = ((akkr) aihfVar.instance).aY + 1;
        aihfVar.copyOnWrite();
        akkr akkrVar = (akkr) aihfVar.instance;
        akkrVar.d |= 1048576;
        akkrVar.aY = j;
    }

    final void c(txb txbVar) {
        switch (txbVar.ordinal()) {
            case 1:
                aihf aihfVar = this.b;
                long j = ((akkr) aihfVar.instance).f + 1;
                aihfVar.copyOnWrite();
                akkr akkrVar = (akkr) aihfVar.instance;
                akkrVar.b |= 1;
                akkrVar.f = j;
                break;
            case 2:
                aihf aihfVar2 = this.b;
                long j2 = ((akkr) aihfVar2.instance).m + 1;
                aihfVar2.copyOnWrite();
                akkr akkrVar2 = (akkr) aihfVar2.instance;
                akkrVar2.b |= SemanticState.Focused;
                akkrVar2.m = j2;
                break;
            case 3:
                aihf aihfVar3 = this.b;
                long j3 = ((akkr) aihfVar3.instance).n + 1;
                aihfVar3.copyOnWrite();
                akkr akkrVar3 = (akkr) aihfVar3.instance;
                akkrVar3.b |= SemanticState.Hidden;
                akkrVar3.n = j3;
                break;
            case 4:
                aihf aihfVar4 = this.b;
                long j4 = ((akkr) aihfVar4.instance).g + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar4 = (akkr) aihfVar4.instance;
                akkrVar4.b |= 2;
                akkrVar4.g = j4;
                break;
            case 5:
                aihf aihfVar5 = this.b;
                long j5 = ((akkr) aihfVar5.instance).h + 1;
                aihfVar5.copyOnWrite();
                akkr akkrVar5 = (akkr) aihfVar5.instance;
                akkrVar5.b |= 4;
                akkrVar5.h = j5;
                break;
            case 6:
                aihf aihfVar6 = this.b;
                long j6 = ((akkr) aihfVar6.instance).i + 1;
                aihfVar6.copyOnWrite();
                akkr akkrVar6 = (akkr) aihfVar6.instance;
                akkrVar6.b |= 8;
                akkrVar6.i = j6;
                break;
            case 7:
                aihf aihfVar7 = this.b;
                long j7 = ((akkr) aihfVar7.instance).j + 1;
                aihfVar7.copyOnWrite();
                akkr akkrVar7 = (akkr) aihfVar7.instance;
                akkrVar7.b |= 16;
                akkrVar7.j = j7;
                break;
            case 8:
                aihf aihfVar8 = this.b;
                long j8 = ((akkr) aihfVar8.instance).k + 1;
                aihfVar8.copyOnWrite();
                akkr akkrVar8 = (akkr) aihfVar8.instance;
                akkrVar8.b |= 32;
                akkrVar8.k = j8;
                break;
            case 9:
                aihf aihfVar9 = this.b;
                long j9 = ((akkr) aihfVar9.instance).l + 1;
                aihfVar9.copyOnWrite();
                akkr akkrVar9 = (akkr) aihfVar9.instance;
                akkrVar9.b |= 64;
                akkrVar9.l = j9;
                break;
            case 10:
            default:
                aihf aihfVar10 = this.b;
                long j10 = ((akkr) aihfVar10.instance).G + 1;
                aihfVar10.copyOnWrite();
                akkr akkrVar10 = (akkr) aihfVar10.instance;
                akkrVar10.b |= 134217728;
                akkrVar10.G = j10;
                break;
            case 11:
                aihf aihfVar11 = this.b;
                long j11 = ((akkr) aihfVar11.instance).o + 1;
                aihfVar11.copyOnWrite();
                akkr akkrVar11 = (akkr) aihfVar11.instance;
                akkrVar11.b |= SemanticState.LiveRegion;
                akkrVar11.o = j11;
                break;
            case 12:
                aihf aihfVar12 = this.b;
                long j12 = ((akkr) aihfVar12.instance).p + 1;
                aihfVar12.copyOnWrite();
                akkr akkrVar12 = (akkr) aihfVar12.instance;
                akkrVar12.b |= SemanticState.ReadOnly;
                akkrVar12.p = j12;
                break;
            case 13:
                aihf aihfVar13 = this.b;
                long j13 = ((akkr) aihfVar13.instance).q + 1;
                aihfVar13.copyOnWrite();
                akkr akkrVar13 = (akkr) aihfVar13.instance;
                akkrVar13.b |= SemanticState.Modal;
                akkrVar13.q = j13;
                break;
            case 14:
                aihf aihfVar14 = this.b;
                long j14 = ((akkr) aihfVar14.instance).r + 1;
                aihfVar14.copyOnWrite();
                akkr akkrVar14 = (akkr) aihfVar14.instance;
                akkrVar14.b |= SemanticState.Obscured;
                akkrVar14.r = j14;
                break;
            case 15:
                aihf aihfVar15 = this.b;
                long j15 = ((akkr) aihfVar15.instance).s + 1;
                aihfVar15.copyOnWrite();
                akkr akkrVar15 = (akkr) aihfVar15.instance;
                akkrVar15.b |= SemanticState.Multiline;
                akkrVar15.s = j15;
                break;
            case 16:
                aihf aihfVar16 = this.b;
                long j16 = ((akkr) aihfVar16.instance).t + 1;
                aihfVar16.copyOnWrite();
                akkr akkrVar16 = (akkr) aihfVar16.instance;
                akkrVar16.b |= 16384;
                akkrVar16.t = j16;
                break;
            case 17:
                aihf aihfVar17 = this.b;
                long j17 = ((akkr) aihfVar17.instance).u + 1;
                aihfVar17.copyOnWrite();
                akkr akkrVar17 = (akkr) aihfVar17.instance;
                akkrVar17.b |= 32768;
                akkrVar17.u = j17;
                break;
            case 18:
                aihf aihfVar18 = this.b;
                long j18 = ((akkr) aihfVar18.instance).v + 1;
                aihfVar18.copyOnWrite();
                akkr akkrVar18 = (akkr) aihfVar18.instance;
                akkrVar18.b |= 65536;
                akkrVar18.v = j18;
                break;
            case 19:
                aihf aihfVar19 = this.b;
                long j19 = ((akkr) aihfVar19.instance).w + 1;
                aihfVar19.copyOnWrite();
                akkr akkrVar19 = (akkr) aihfVar19.instance;
                akkrVar19.b |= 131072;
                akkrVar19.w = j19;
                break;
            case 20:
                aihf aihfVar20 = this.b;
                long j20 = ((akkr) aihfVar20.instance).E + 1;
                aihfVar20.copyOnWrite();
                akkr akkrVar20 = (akkr) aihfVar20.instance;
                akkrVar20.b |= 33554432;
                akkrVar20.E = j20;
                break;
            case 21:
                aihf aihfVar21 = this.b;
                long j21 = ((akkr) aihfVar21.instance).F + 1;
                aihfVar21.copyOnWrite();
                akkr akkrVar21 = (akkr) aihfVar21.instance;
                akkrVar21.b |= 67108864;
                akkrVar21.F = j21;
                break;
            case 22:
                aihf aihfVar22 = this.b;
                long j22 = ((akkr) aihfVar22.instance).x + 1;
                aihfVar22.copyOnWrite();
                akkr akkrVar22 = (akkr) aihfVar22.instance;
                akkrVar22.b |= 262144;
                akkrVar22.x = j22;
                break;
            case 23:
                aihf aihfVar23 = this.b;
                long j23 = ((akkr) aihfVar23.instance).y + 1;
                aihfVar23.copyOnWrite();
                akkr akkrVar23 = (akkr) aihfVar23.instance;
                akkrVar23.b |= 524288;
                akkrVar23.y = j23;
                break;
            case 24:
                aihf aihfVar24 = this.b;
                long j24 = ((akkr) aihfVar24.instance).z + 1;
                aihfVar24.copyOnWrite();
                akkr akkrVar24 = (akkr) aihfVar24.instance;
                akkrVar24.b |= 1048576;
                akkrVar24.z = j24;
                break;
            case 25:
                aihf aihfVar25 = this.b;
                long j25 = ((akkr) aihfVar25.instance).A + 1;
                aihfVar25.copyOnWrite();
                akkr akkrVar25 = (akkr) aihfVar25.instance;
                akkrVar25.b |= 2097152;
                akkrVar25.A = j25;
                break;
            case 26:
                aihf aihfVar26 = this.b;
                long j26 = ((akkr) aihfVar26.instance).C + 1;
                aihfVar26.copyOnWrite();
                akkr akkrVar26 = (akkr) aihfVar26.instance;
                akkrVar26.b |= 8388608;
                akkrVar26.C = j26;
                break;
            case 27:
                aihf aihfVar27 = this.b;
                long j27 = ((akkr) aihfVar27.instance).D + 1;
                aihfVar27.copyOnWrite();
                akkr akkrVar27 = (akkr) aihfVar27.instance;
                akkrVar27.b |= 16777216;
                akkrVar27.D = j27;
                break;
            case 28:
                aihf aihfVar28 = this.b;
                long j28 = ((akkr) aihfVar28.instance).B + 1;
                aihfVar28.copyOnWrite();
                akkr akkrVar28 = (akkr) aihfVar28.instance;
                akkrVar28.b |= 4194304;
                akkrVar28.B = j28;
                break;
            case 29:
                aihf aihfVar29 = this.b;
                long j29 = ((akkr) aihfVar29.instance).aX + 1;
                aihfVar29.copyOnWrite();
                akkr akkrVar29 = (akkr) aihfVar29.instance;
                akkrVar29.d |= 524288;
                akkrVar29.aX = j29;
                break;
            case 30:
                b();
                break;
            case 31:
                aihf aihfVar30 = this.b;
                long j30 = ((akkr) aihfVar30.instance).aZ + 1;
                aihfVar30.copyOnWrite();
                akkr akkrVar30 = (akkr) aihfVar30.instance;
                akkrVar30.d |= 2097152;
                akkrVar30.aZ = j30;
                break;
            case 32:
                aihf aihfVar31 = this.b;
                long j31 = ((akkr) aihfVar31.instance).ba + 1;
                aihfVar31.copyOnWrite();
                akkr akkrVar31 = (akkr) aihfVar31.instance;
                akkrVar31.d |= 4194304;
                akkrVar31.ba = j31;
                break;
            case 33:
                aihf aihfVar32 = this.b;
                long j32 = ((akkr) aihfVar32.instance).bb + 1;
                aihfVar32.copyOnWrite();
                akkr akkrVar32 = (akkr) aihfVar32.instance;
                akkrVar32.d |= 8388608;
                akkrVar32.bb = j32;
                break;
            case 34:
                aihf aihfVar33 = this.b;
                long j33 = ((akkr) aihfVar33.instance).bc + 1;
                aihfVar33.copyOnWrite();
                akkr akkrVar33 = (akkr) aihfVar33.instance;
                akkrVar33.d |= 16777216;
                akkrVar33.bc = j33;
                break;
            case 35:
                aihf aihfVar34 = this.b;
                long j34 = ((akkr) aihfVar34.instance).bh + 1;
                aihfVar34.copyOnWrite();
                akkr akkrVar34 = (akkr) aihfVar34.instance;
                akkrVar34.d |= 536870912;
                akkrVar34.bh = j34;
                break;
            case 36:
                aihf aihfVar35 = this.b;
                long j35 = ((akkr) aihfVar35.instance).bd + 1;
                aihfVar35.copyOnWrite();
                akkr akkrVar35 = (akkr) aihfVar35.instance;
                akkrVar35.d |= 33554432;
                akkrVar35.bd = j35;
                break;
            case 37:
                aihf aihfVar36 = this.b;
                long j36 = ((akkr) aihfVar36.instance).be + 1;
                aihfVar36.copyOnWrite();
                akkr akkrVar36 = (akkr) aihfVar36.instance;
                akkrVar36.d |= 67108864;
                akkrVar36.be = j36;
                break;
            case 38:
                aihf aihfVar37 = this.b;
                long j37 = ((akkr) aihfVar37.instance).bi + 1;
                aihfVar37.copyOnWrite();
                akkr akkrVar37 = (akkr) aihfVar37.instance;
                akkrVar37.d |= 1073741824;
                akkrVar37.bi = j37;
                break;
            case 39:
                aihf aihfVar38 = this.b;
                long j38 = ((akkr) aihfVar38.instance).bk + 1;
                aihfVar38.copyOnWrite();
                akkr akkrVar38 = (akkr) aihfVar38.instance;
                akkrVar38.e |= 1;
                akkrVar38.bk = j38;
                break;
        }
    }

    final void d() {
        aihf aihfVar = this.b;
        long j = ((akkr) aihfVar.instance).al + 1;
        aihfVar.copyOnWrite();
        akkr akkrVar = (akkr) aihfVar.instance;
        akkrVar.c |= 1073741824;
        akkrVar.al = j;
    }

    public final void e() {
        aihf aihfVar = this.b;
        int i = ((akkr) aihfVar.instance).bo + 1;
        aihfVar.copyOnWrite();
        akkr akkrVar = (akkr) aihfVar.instance;
        akkrVar.e |= 16;
        akkrVar.bo = i;
    }

    final void f() {
        aihf aihfVar = this.b;
        long j = ((akkr) aihfVar.instance).aU + 1;
        aihfVar.copyOnWrite();
        akkr akkrVar = (akkr) aihfVar.instance;
        akkrVar.d |= 32768;
        akkrVar.aU = j;
    }
}
