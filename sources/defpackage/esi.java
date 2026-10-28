package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class esi extends esg {
    public esi(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public esi(Class cls, Class cls2) {
        super(a.cc(cls2, cls, "Failed to find any ModelLoaders for model: ", " and data: "));
    }

    public esi(Object obj, List list) {
        super(a.bX(obj, list, "Found ModelLoaders for model class: ", ", but none that handle this specific model instance: "));
    }
}
