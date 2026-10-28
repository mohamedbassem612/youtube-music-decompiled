package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mfx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final CommandOuterClass$Command e;
    public final CommandOuterClass$Command f;
    public final nrv g;
    public final qr h;
    public final int i;
    public final mfw j;
    public final Object k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final aigj o;
    public final int p;

    public mfx(String str, String str2, String str3, String str4, CommandOuterClass$Command commandOuterClass$Command, CommandOuterClass$Command commandOuterClass$Command2, nrv nrvVar, qr qrVar, int i, int i2, mfw mfwVar, Object obj, Boolean bool, Boolean bool2, Boolean bool3, aigj aigjVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = commandOuterClass$Command;
        this.f = commandOuterClass$Command2;
        this.g = nrvVar;
        this.h = qrVar;
        this.p = i;
        this.i = i2;
        this.j = mfwVar;
        this.k = obj;
        this.l = bool;
        this.m = bool2;
        this.n = bool3;
        this.o = aigjVar;
    }

    public static mfv a() {
        mfv mfvVar = new mfv();
        mfvVar.o = 1;
        mfvVar.b(-1);
        return mfvVar;
    }

    public final boolean equals(Object obj) {
        mfw mfwVar;
        Object obj2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mfx) {
            mfx mfxVar = (mfx) obj;
            String str = this.a;
            if (str != null ? str.equals(mfxVar.a) : mfxVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(mfxVar.b) : mfxVar.b == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(mfxVar.c) : mfxVar.c == null) {
                        String str4 = this.d;
                        if (str4 != null ? str4.equals(mfxVar.d) : mfxVar.d == null) {
                            CommandOuterClass$Command commandOuterClass$Command = this.e;
                            if (commandOuterClass$Command != null ? commandOuterClass$Command.equals(mfxVar.e) : mfxVar.e == null) {
                                CommandOuterClass$Command commandOuterClass$Command2 = this.f;
                                if (commandOuterClass$Command2 != null ? commandOuterClass$Command2.equals(mfxVar.f) : mfxVar.f == null) {
                                    nrv nrvVar = this.g;
                                    if (nrvVar != null ? nrvVar.equals(mfxVar.g) : mfxVar.g == null) {
                                        qr qrVar = this.h;
                                        if (qrVar != null ? qrVar.equals(mfxVar.h) : mfxVar.h == null) {
                                            int i = this.p;
                                            int i2 = mfxVar.p;
                                            if (i == 0) {
                                                throw null;
                                            }
                                            if (i == i2 && this.i == mfxVar.i && ((mfwVar = this.j) != null ? mfwVar.equals(mfxVar.j) : mfxVar.j == null) && ((obj2 = this.k) != null ? obj2.equals(mfxVar.k) : mfxVar.k == null) && ((bool = this.l) != null ? bool.equals(mfxVar.l) : mfxVar.l == null) && ((bool2 = this.m) != null ? bool2.equals(mfxVar.m) : mfxVar.m == null) && ((bool3 = this.n) != null ? bool3.equals(mfxVar.n) : mfxVar.n == null)) {
                                                aigj aigjVar = this.o;
                                                if (aigjVar == null) {
                                                    if (mfxVar.o == null) {
                                                        return true;
                                                    }
                                                } else if (aigjVar.equals(mfxVar.o)) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = (((iHashCode ^ 1000003) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        CommandOuterClass$Command commandOuterClass$Command = this.e;
        int iHashCode5 = (iHashCode4 ^ (commandOuterClass$Command == null ? 0 : commandOuterClass$Command.hashCode())) * 1000003;
        CommandOuterClass$Command commandOuterClass$Command2 = this.f;
        int iHashCode6 = (iHashCode5 ^ (commandOuterClass$Command2 == null ? 0 : commandOuterClass$Command2.hashCode())) * 1000003;
        nrv nrvVar = this.g;
        int iHashCode7 = iHashCode6 ^ (nrvVar == null ? 0 : nrvVar.hashCode());
        qr qrVar = this.h;
        int iHashCode8 = ((iHashCode7 * (-721379959)) ^ (qrVar == null ? 0 : qrVar.hashCode())) * 1000003;
        int i = this.p;
        a.bj(i);
        int i2 = (((iHashCode8 ^ i) * 1000003) ^ this.i) * 1000003;
        mfw mfwVar = this.j;
        int iHashCode9 = (i2 ^ (mfwVar == null ? 0 : mfwVar.hashCode())) * 1000003;
        Object obj = this.k;
        int iHashCode10 = (iHashCode9 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        Boolean bool = this.l;
        int iHashCode11 = (iHashCode10 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.m;
        int iHashCode12 = (iHashCode11 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.n;
        int iHashCode13 = (iHashCode12 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        aigj aigjVar = this.o;
        return iHashCode13 ^ (aigjVar != null ? aigjVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        int i = this.p;
        qr qrVar = this.h;
        nrv nrvVar = this.g;
        CommandOuterClass$Command commandOuterClass$Command = this.f;
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(commandOuterClass$Command);
        String strValueOf3 = String.valueOf(nrvVar);
        String strValueOf4 = String.valueOf(qrVar);
        if (i == 1) {
            str = "ALERT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "LAYOUT_FULLSCREEN";
        } else {
            str = "FULLSCREEN";
        }
        String str2 = this.d;
        String str3 = this.c;
        String str4 = this.b;
        String str5 = this.a;
        int i2 = this.i;
        mfw mfwVar = this.j;
        Object obj = this.k;
        Boolean bool = this.l;
        Boolean bool2 = this.m;
        Boolean bool3 = this.n;
        aigj aigjVar = this.o;
        return "DialogData{title=" + str5 + ", subtitle=" + str4 + ", actionTitle=" + str3 + ", cancelTitle=" + str2 + ", actionCommand=" + strValueOf + ", cancelCommand=" + strValueOf2 + ", commandEventData=" + strValueOf3 + ", safeCommandEventData=null, onBackPressedCallback=" + strValueOf4 + ", dialogType=" + str + ", requestedOrientation=" + i2 + ", dialogEventListener=" + String.valueOf(mfwVar) + ", interactionLogger=" + String.valueOf(obj) + ", cancelable=" + bool + ", keepScreenOn=" + bool2 + ", useSlideAnimations=" + bool3 + ", newScreenTrackingParams=" + String.valueOf(aigjVar) + '}';
    }

    public mfx() {
        throw null;
    }
}
