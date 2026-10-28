package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usw extends uhv {
    public final Optional b;
    private final dou c;

    public usw(cc ccVar) {
        super(ccVar, true);
        this.b = Optional.empty();
        Optional.empty();
        dou savedStateRegistry = ccVar.getSavedStateRegistry();
        this.c = savedStateRegistry;
        Optional.ofNullable(savedStateRegistry.a("MediaCompositionFragmentState"));
    }
}
