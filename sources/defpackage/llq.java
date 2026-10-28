package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llq extends kmz {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new mda(), mda.m(null));
    }

    public llq(Context context) {
        super(context, null, lll.a, kms.f, kmy.a);
    }

    public final lpa a(String str) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kak(str, 11);
        return super.A(0, kpjVar.a());
    }

    public final lpa b(qkq qkqVar) {
        qkqVar.getClass();
        kpj kpjVar = new kpj();
        kpjVar.a = new kgr(qkqVar, 3);
        kpjVar.b = new klq[]{llf.a};
        kpjVar.b();
        return super.A(0, kpjVar.a());
    }

    public final lpa c() {
        kpj kpjVar = new kpj();
        kpjVar.a = new kah(6);
        kpjVar.b = new klq[]{llf.i};
        kpjVar.b();
        return super.A(0, kpjVar.a());
    }

    public final lpa d(String str) {
        if (klu.d.m(this.v, 12451000) != 0) {
            return mda.l(new kmu(new Status(16, null, null, null)));
        }
        kpj kpjVar = new kpj();
        kpjVar.a = new jyx(str, 8);
        return super.A(0, kpjVar.a());
    }

    public final lpa e(String str, String str2) {
        kpj kpjVar = new kpj();
        kpjVar.a = new jyx(str, str2, 7);
        return super.A(0, kpjVar.a());
    }

    public final lpa f(final String str, final int i, final String[] strArr) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kpe() { // from class: llo
            @Override // defpackage.kpe
            public final void a(Object obj, Object obj2) {
                int i2 = llq.a;
                lls llsVar = new lls((kjc) obj2);
                llt lltVar = (llt) ((llu) obj).C();
                Parcel parcelC = lltVar.c();
                ClassLoader classLoader = gdc.a;
                parcelC.writeStrongBinder(llsVar);
                parcelC.writeString(str);
                parcelC.writeInt(i);
                parcelC.writeStringArray(strArr);
                parcelC.writeByteArray(null);
                lltVar.e(1, parcelC);
            }
        };
        return super.A(0, kpjVar.a());
    }

    public final void g(final int[] iArr, final String str, final String str2) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kpe() { // from class: llp
            @Override // defpackage.kpe
            public final void a(Object obj, Object obj2) {
                int i = llq.a;
                lls llsVar = new lls((kjc) obj2);
                llt lltVar = (llt) ((llu) obj).C();
                String[] strArr = {str2};
                Parcel parcelC = lltVar.c();
                ClassLoader classLoader = gdc.a;
                parcelC.writeStrongBinder(llsVar);
                parcelC.writeString("__internal.external_ids#".concat(str));
                parcelC.writeInt(0);
                parcelC.writeStringArray(strArr);
                parcelC.writeIntArray(iArr);
                parcelC.writeByteArray(null);
                lltVar.e(2, parcelC);
            }
        };
        super.A(0, kpjVar.a());
    }

    public final lpa h(String str) {
        kpj kpjVar = new kpj();
        kpjVar.a = new jyx((Object) this, str, 9);
        return super.A(0, kpjVar.a());
    }
}
