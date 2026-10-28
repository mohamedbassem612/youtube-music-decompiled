package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class daz implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = bus.a;
        bur burVar = new bur();
        CharSequence charSequence = bundle.getCharSequence(bus.a);
        if (charSequence != null) {
            burVar.d(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(bus.b);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                    int i2 = bundle2.getInt(buu.a);
                    int i3 = bundle2.getInt(buu.b);
                    int i4 = bundle2.getInt(buu.c);
                    int i5 = bundle2.getInt(buu.d, -1);
                    Bundle bundle3 = bundle2.getBundle(buu.e);
                    if (i5 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(buw.a);
                        string.getClass();
                        spannableStringValueOf.setSpan(new buw(string, bundle3.getInt(buw.b)), i2, i3, i4);
                    } else if (i5 == 2) {
                        bundle3.getClass();
                        spannableStringValueOf.setSpan(new bux(bundle3.getInt(bux.a), bundle3.getInt(bux.b), bundle3.getInt(bux.c)), i2, i3, i4);
                    } else if (i5 == 3) {
                        spannableStringValueOf.setSpan(new buv(), i2, i3, i4);
                    } else if (i5 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(buy.a);
                        string2.getClass();
                        spannableStringValueOf.setSpan(new buy(string2), i2, i3, i4);
                    }
                }
                burVar.d(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(bus.c);
        if (alignment != null) {
            burVar.b = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(bus.d);
        if (alignment2 != null) {
            burVar.c = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(bus.e);
        if (bitmap != null) {
            burVar.b(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(bus.f);
            if (byteArray != null) {
                burVar.b(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str2 = bus.g;
        if (bundle.containsKey(str2)) {
            String str3 = bus.h;
            if (bundle.containsKey(str3)) {
                burVar.c(bundle.getFloat(str2), bundle.getInt(str3));
            }
        }
        String str4 = bus.i;
        if (bundle.containsKey(str4)) {
            burVar.d = bundle.getInt(str4);
        }
        String str5 = bus.j;
        if (bundle.containsKey(str5)) {
            burVar.e = bundle.getFloat(str5);
        }
        String str6 = bus.k;
        if (bundle.containsKey(str6)) {
            burVar.f = bundle.getInt(str6);
        }
        String str7 = bus.m;
        if (bundle.containsKey(str7)) {
            String str8 = bus.l;
            if (bundle.containsKey(str8)) {
                burVar.e(bundle.getFloat(str7), bundle.getInt(str8));
            }
        }
        String str9 = bus.n;
        if (bundle.containsKey(str9)) {
            burVar.g = bundle.getFloat(str9);
        }
        String str10 = bus.o;
        if (bundle.containsKey(str10)) {
            burVar.h = bundle.getFloat(str10);
        }
        String str11 = bus.p;
        if (bundle.containsKey(str11)) {
            burVar.f(bundle.getInt(str11));
        }
        if (!bundle.getBoolean(bus.q, false)) {
            burVar.i = false;
        }
        String str12 = bus.r;
        if (bundle.containsKey(str12)) {
            burVar.j = bundle.getInt(str12);
        }
        String str13 = bus.s;
        if (bundle.containsKey(str13)) {
            burVar.k = bundle.getFloat(str13);
        }
        String str14 = bus.t;
        if (bundle.containsKey(str14)) {
            burVar.l = bundle.getInt(str14);
        }
        return burVar.a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
