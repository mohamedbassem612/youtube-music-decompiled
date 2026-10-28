package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ow extends Property {
    public ow(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).f(((Float) obj2).floatValue());
    }
}
