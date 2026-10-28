package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wlu extends wkf implements toa {
    @Deprecated
    public wlu(String str, abxv abxvVar, zwa zwaVar, int i, boolean z, Optional optional, boolean z2, boolean z3) {
        super(str, abxvVar, zwaVar, i, z, optional, null, null, z2, true == z3 ? 4 : 1);
    }

    public aiir a() {
        throw null;
    }

    public wlu(abxv abxvVar, zwa zwaVar, boolean z, Optional optional, String str, Boolean bool) {
        super("att/get", abxvVar, zwaVar, 1, z, optional, str, bool, false, 1);
    }

    public wlu(String str, abxv abxvVar) {
        this(str, abxvVar, zvz.a, 1, false, null, null);
    }

    public wlu(String str, abxv abxvVar, zwa zwaVar, int i, boolean z, Optional optional) {
        super(str, abxvVar, zwaVar, i, z, optional, null, null, false, 1);
    }

    public wlu(String str, abxv abxvVar, zwa zwaVar, int i, boolean z, String str2, Boolean bool) {
        super(str, abxvVar, zwaVar, i, z, Optional.empty(), str2, bool, false, 1);
    }

    public wlu(abxv abxvVar, zwa zwaVar, boolean z, String str, Boolean bool) {
        super("log_event", abxvVar, zwaVar, 1, z, Optional.empty(), str, bool, false, 3);
    }

    public wlu(abxv abxvVar, zwa zwaVar, boolean z, boolean z2) {
        super("search", abxvVar, zwaVar, 3, z, Optional.empty(), null, null, z2, 1);
    }
}
