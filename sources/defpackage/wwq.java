package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwq extends wwi {
    private final wwn e;

    public wwq(ahgb ahgbVar, vxe vxeVar, ttm ttmVar, aeiv aeivVar, Context context, wwn wwnVar, ScheduledExecutorService scheduledExecutorService, vxz vxzVar) {
        super(ahgbVar, vxeVar, ttmVar, aeivVar, context, scheduledExecutorService, vxzVar);
        this.e = wwnVar;
    }

    @Override // defpackage.wwi, defpackage.wxl
    public final void jl(wxm wxmVar) {
        super.jl(wxmVar);
        this.c = this.e;
    }
}
