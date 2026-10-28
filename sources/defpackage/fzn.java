package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzn extends fze {
    @Override // defpackage.fze
    public final fyy a(String str, kwq kwqVar, List list) {
        if (str == null || str.isEmpty() || !kwqVar.B(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        fyy fyyVarX = kwqVar.x(str);
        if (fyyVarX instanceof fys) {
            return ((fys) fyyVarX).a(kwqVar, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
