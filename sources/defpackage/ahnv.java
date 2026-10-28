package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahnv {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public ahnv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (ksz.a(str)) {
            throw new IllegalStateException("ApplicationId must be set.");
        }
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.h = str7;
        this.d = str8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahnv)) {
            return false;
        }
        ahnv ahnvVar = (ahnv) obj;
        return Objects.equals(this.b, ahnvVar.b) && Objects.equals(this.a, ahnvVar.a) && Objects.equals(this.e, ahnvVar.e) && Objects.equals(this.f, ahnvVar.f) && Objects.equals(this.c, ahnvVar.c) && Objects.equals(this.g, ahnvVar.g) && Objects.equals(this.h, ahnvVar.h) && Objects.equals(this.d, ahnvVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.e, this.f, this.c, this.g, this.h, this.d);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("applicationId", this.b, arrayList);
        kro.p("apiKey", this.a, arrayList);
        kro.p("databaseUrl", this.e, arrayList);
        kro.p("gcmSenderId", this.c, arrayList);
        kro.p("storageBucket", this.g, arrayList);
        kro.p("recaptchaSiteKey", this.h, arrayList);
        kro.p("projectId", this.d, arrayList);
        return kro.o(arrayList, this);
    }
}
