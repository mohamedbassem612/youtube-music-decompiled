package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class weu implements weh {
    private static final wet b = new wet();
    public final byte[] a;
    private final String c;

    public weu(String str, byte[] bArr) {
        this.c = str;
        this.a = bArr;
    }

    public static wes e(String str, byte[] bArr) {
        wes wesVar = new wes();
        wesVar.b = str;
        wesVar.a = bArr;
        return wesVar;
    }

    @Override // defpackage.weh
    public final /* synthetic */ agkz a() {
        return agpr.a;
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.a;
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        wes wesVarD = wet.d(this.c);
        wesVarD.a = this.a;
        return wesVarD;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        if (!(obj instanceof weu)) {
            return false;
        }
        weu weuVar = (weu) obj;
        return Objects.equals(this.c, weuVar.c) && Arrays.equals(this.a, weuVar.a);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(Arrays.hashCode(this.a)));
    }

    public wet getType() {
        return b;
    }
}
