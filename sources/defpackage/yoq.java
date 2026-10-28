package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yoq {
    public final zjr a;
    public final zkd b;
    public final mbc c;
    public String f;
    private String j;
    private int k;
    public int d = -1;
    public int e = -1;
    public twi i = new gek(3);
    public volatile Optional g = Optional.empty();
    public volatile boolean h = false;

    public yoq(zjr zjrVar, mbc mbcVar) {
        this.a = zjrVar;
        this.b = zjrVar.u;
        this.c = mbcVar;
    }

    public final yog a() {
        int i;
        int i2 = this.e;
        if (i2 > 0 && (i = this.d) > 0 && i2 >= i) {
            return new yog(this.e, this.d);
        }
        zjr zjrVar = this.a;
        if (zjrVar.bX()) {
            return zjrVar.bt() ? yoc.d : yoc.b;
        }
        return zjrVar.bt() ? yoc.c : yoc.a;
    }

    public final String b() {
        return ahno.Z(this.f);
    }

    public final boolean c() {
        if (this.h) {
            return ((Boolean) this.g.orElse(Boolean.FALSE)).booleanValue();
        }
        zjr zjrVar = this.a;
        if (!zjrVar.fj() || !zjrVar.fi()) {
            return false;
        }
        int i = tqr.a;
        tqj tqjVar = zjrVar.v;
        return tqjVar.k(88401) ? tqjVar.k(88402) : tqjVar.k(1073830223);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0166 A[PHI: r4
      0x0166: PHI (r4v16 int) = (r4v15 int), (r4v17 int), (r4v18 int), (r4v19 int), (r4v20 int), (r4v21 int), (r4v22 int) binds: [B:87:0x0147, B:89:0x014b, B:91:0x014f, B:93:0x0153, B:96:0x0159, B:98:0x015d, B:100:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0168  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    public final yoc d(boolean z, wiu wiuVar, String str, zkj zkjVar) {
        int iAV;
        long j;
        long j2;
        boolean z2;
        zkc zkcVar;
        zkd zkdVar = this.b;
        zkc zkcVarN = zkdVar.n(1);
        if (TextUtils.equals(zkcVarN.a, null) && !TextUtils.equals(str, null)) {
            zkcVarN.a = str;
            zkdVar.i(zkcVarN.b, zkcVarN.c, zkcVarN.d, str, zkcVarN.f);
        }
        boolean zEquals = TextUtils.equals(str, null);
        if (zEquals) {
            iAV = 2;
        } else {
            aqdd aqddVar = wiuVar.d.z;
            if (aqddVar == null) {
                aqddVar = aqdd.a;
            }
            iAV = a.aV(aqddVar.b);
            if (iAV == 0) {
                iAV = 1;
            }
        }
        boolean zEquals2 = TextUtils.equals(str, zkcVarN.a);
        long j3 = zkcVarN.d;
        int i = j3 == -1 ? 0 : 1;
        if (!zEquals2) {
            zkcVarN.f = agpr.a;
        }
        int i2 = i;
        long epochMilli = this.c.f().toEpochMilli();
        aoqd aoqdVar = wiuVar.d;
        if ((aoqdVar.c & SemanticState.Focused) != 0) {
            aqdd aqddVar2 = aoqdVar.z;
            if (aqddVar2 == null) {
                aqddVar2 = aqdd.a;
            }
            j = aqddVar2.c;
        } else {
            j = 0;
        }
        if (j == 0) {
            j = 259200000;
        }
        if ((aoqdVar.c & SemanticState.Focused) != 0) {
            aqdd aqddVar3 = aoqdVar.z;
            if (aqddVar3 == null) {
                aqddVar3 = aqdd.a;
            }
            j2 = aqddVar3.d;
        } else {
            j2 = 0;
        }
        if (j2 == 0) {
            j2 = 18000000;
        }
        zkc zkcVarN2 = zkdVar.n(1);
        long j4 = zkcVarN2.d;
        if (j4 == -1 || epochMilli - j4 <= j) {
            long j5 = zkcVarN2.e;
            if (j5 == -1 || epochMilli - j5 <= j2) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        int i3 = -1;
        int i4 = 2;
        if (iAV - 1 != 2) {
            if (z2) {
                zkcVar = zkcVarN;
            } else {
                zkcVar = zkcVarN;
                i3 = zkcVar.b;
                if (j3 != -1) {
                    if (zEquals2) {
                        i4 = 1;
                    }
                }
            }
            i4 = 0;
        } else {
            zkcVar = zkcVarN;
            if (zEquals2) {
                i3 = zkcVar.b;
                i4 = i2;
            } else {
                i4 = 0;
            }
        }
        if (!zEquals) {
            this.k = i4;
            if (!TextUtils.equals(this.j, str)) {
                taf.j(zkdVar.a.b(new xfj(epochMilli, 3)), new xwk(14));
                this.j = str;
            }
        }
        agkz agkzVar = zkcVar.f;
        arfb arfbVarF = zkdVar.f(str);
        zjr zjrVar = this.a;
        boolean zAe = wgs.ae(i3);
        int iF = zjrVar.f();
        if (zAe) {
            iF = i3;
        } else if (z) {
            iF = Alert.DURATION_SHOW_INDEFINITELY;
        } else if (arfbVarF != arfb.VIDEO_QUALITY_SETTING_DATA_SAVER) {
            iF = 720;
        }
        if (!wgs.ae(i3)) {
            if (!zjrVar.j.m(135, 45426685L) || wiuVar.an()) {
                i3 = 0;
            } else {
                akwm akwmVar = aoqdVar.f;
                if (akwmVar == null) {
                    akwmVar = akwm.b;
                }
                int i5 = akwmVar.aN;
                int i6 = 144;
                if (i5 != 144) {
                    i6 = 240;
                    if (i5 != 240) {
                        i6 = 360;
                        if (i5 != 360) {
                            i6 = 480;
                            if (i5 == 480) {
                                i3 = i6;
                            } else if (i5 != 720) {
                                i6 = 1080;
                                if (i5 != 1080) {
                                    i6 = 1440;
                                    if (i5 != 1440) {
                                        i6 = 2160;
                                        if (i5 != 2160) {
                                            i3 = 0;
                                        }
                                    }
                                }
                                i3 = i6;
                            } else {
                                i3 = 720;
                            }
                        } else {
                            i3 = i6;
                        }
                    } else {
                        i3 = i6;
                    }
                } else {
                    i3 = i6;
                }
            }
        }
        int iMin = Math.min(i3, iF);
        yog yogVarA = a();
        zkc zkcVarN3 = zkdVar.n(1);
        long j6 = zkcVarN3.d;
        long j7 = j6 == -1 ? -1L : epochMilli - j6;
        int i7 = true != c() ? 0 : 64;
        if (zjrVar.i.m(421, 45793284L)) {
            i7 |= SemanticState.Hidden;
        }
        return new yoc(new yog(iF, iMin, this.k, agkzVar), yogVarA, true, this.f, zkcVarN3.b, zkcVarN3.c, j7, Alert.DURATION_SHOW_INDEFINITELY, i7, zkjVar);
    }
}
