package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nvv {
    public static final String a(Exception exc) {
        Objects.checkIndex(0, 5);
        if (exc instanceof awxi) {
            return "TIMEOUT_CANCELLATION_EXCEPTION";
        }
        if (exc instanceof IllegalStateException) {
            return "ILLEGAL_STATE_EXCEPTION";
        }
        if (exc instanceof IllegalArgumentException) {
            return "ILLEGAL_ARGUMENT_EXCEPTION";
        }
        return exc instanceof RuntimeException ? "RUNTIME_EXCEPTION" : "OTHER_EXCEPTION";
    }
}
