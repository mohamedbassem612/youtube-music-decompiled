package androidx.car.app.model;

import defpackage.abp;
import defpackage.yf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ParkedOnlyOnClickListener implements abp {
    private final abp mListener;

    private ParkedOnlyOnClickListener(abp abpVar) {
        this.mListener = abpVar;
    }

    public static ParkedOnlyOnClickListener create(abp abpVar) {
        abpVar.getClass();
        return new ParkedOnlyOnClickListener(abpVar);
    }

    @Override // defpackage.abp
    public void onClick() {
        this.mListener.onClick();
    }
}
