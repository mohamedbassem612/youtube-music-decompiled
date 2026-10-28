package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.Spanned;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bwa implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ bwa(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        daj dajVarE;
        Object obj2;
        switch (this.$cid) {
            case 0:
                return new IndexOutOfBoundsException((String) obj);
            case 1:
                return new StringIndexOutOfBoundsException((String) obj);
            case 2:
                cff cffVar = cff.a;
                return new HashSet();
            case 3:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 4:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 5:
                daj dajVar = (daj) obj;
                if (dajVar == null) {
                    return null;
                }
                dajVarE = czv.e(dajVar);
                if (dajVarE == null) {
                    obj2 = dajVarE;
                    return null;
                }
                break;
            case 6:
                bus busVar = (bus) obj;
                Bundle bundle = new Bundle();
                CharSequence charSequence = busVar.u;
                if (charSequence != null) {
                    bundle.putCharSequence(bus.a, charSequence);
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        String str = buu.a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (buw buwVar : (buw[]) spanned.getSpans(0, spanned.length(), buw.class)) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(buw.a, buwVar.c);
                            bundle2.putInt(buw.b, buwVar.d);
                            arrayList.add(buu.a(spanned, buwVar, 1, bundle2));
                        }
                        for (bux buxVar : (bux[]) spanned.getSpans(0, spanned.length(), bux.class)) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt(bux.a, buxVar.d);
                            bundle3.putInt(bux.b, buxVar.e);
                            bundle3.putInt(bux.c, buxVar.f);
                            arrayList.add(buu.a(spanned, buxVar, 2, bundle3));
                        }
                        for (buv buvVar : (buv[]) spanned.getSpans(0, spanned.length(), buv.class)) {
                            arrayList.add(buu.a(spanned, buvVar, 3, null));
                        }
                        for (buy buyVar : (buy[]) spanned.getSpans(0, spanned.length(), buy.class)) {
                            Bundle bundle4 = new Bundle();
                            bundle4.putString(buy.a, buyVar.b);
                            arrayList.add(buu.a(spanned, buyVar, 4, bundle4));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle.putParcelableArrayList(bus.b, arrayList);
                        }
                    }
                }
                bundle.putSerializable(bus.c, busVar.v);
                bundle.putSerializable(bus.d, busVar.w);
                bundle.putFloat(bus.g, busVar.y);
                bundle.putInt(bus.h, busVar.z);
                bundle.putInt(bus.i, busVar.A);
                bundle.putFloat(bus.j, busVar.B);
                bundle.putInt(bus.k, busVar.C);
                bundle.putInt(bus.l, busVar.H);
                bundle.putFloat(bus.m, busVar.I);
                bundle.putFloat(bus.n, busVar.D);
                bundle.putFloat(bus.o, busVar.E);
                bundle.putBoolean(bus.q, busVar.F);
                bundle.putInt(bus.p, busVar.G);
                bundle.putInt(bus.r, busVar.J);
                bundle.putFloat(bus.s, busVar.K);
                bundle.putInt(bus.t, busVar.L);
                Bitmap bitmap = busVar.x;
                obj2 = bundle;
                if (bitmap != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ahno.O(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle.putByteArray(bus.f, byteArrayOutputStream.toByteArray());
                    obj2 = bundle;
                }
                break;
            case 7:
                agrf agrfVar = gpl.U;
                return afxw.r((apji) obj);
            case 8:
                adts adtsVar = (adts) obj;
                agrf agrfVar2 = gpl.U;
                iya iyaVarD = iyb.d();
                iyaVarD.b(adtsVar);
                iyaVarD.d(adtsVar.a() ? hks.a.toMillis() : 0L);
                iyaVarD.c(adtsVar.a());
                return iyaVarD.a();
            case 9:
                return ((apyu) obj).name();
            case 10:
                return afxw.s(obj);
            case 11:
                alay alayVar = ((ajsy) obj).f;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                return ackj.k(null, alayVar, null, false).toString();
            case 12:
                return kro.aI((String) obj);
            case 13:
                return wfs.h(((weh) ((Optional) obj).get()).b());
            case 14:
                return wfs.g(62, (String) obj);
            case 15:
                int i = zne.c;
                return zik.aA((String) obj);
            case 16:
                return zik.aO((String) obj);
            case 17:
                return (MediaBrowserCompat$MediaItem) ((Optional) obj).get();
            case 18:
                return Float.valueOf(((arbl) obj).d);
            case 19:
                return rpi.Q((Optional) obj);
            default:
                return (weh) ((Optional) obj).get();
        }
        obj2 = dajVarE;
        return obj2;
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
