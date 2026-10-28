package app.rive;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFocusStateKt {
    public static final RiveFocusState riveFocusStateOf(boolean z, boolean z2) {
        return z ? new RiveFocusState.Focused(z2) : RiveFocusState.Unfocused.INSTANCE;
    }
}
