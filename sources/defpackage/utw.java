package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utw extends Exception {
    public utw(String str, utu utuVar) {
        super("Failed to build mutation: " + String.valueOf(utuVar.getClass()) + '\n' + str);
    }

    public utw(Exception exc, utv utvVar) {
        super("Failed to apply mutation to composition: ".concat(String.valueOf(String.valueOf(utvVar.getClass()))), exc);
    }

    public utw(Exception exc, utu utuVar) {
        super("Failed to build mutation: ".concat(String.valueOf(String.valueOf(utuVar.getClass()))), exc);
    }

    public utw(String str, utv utvVar) {
        super("Failed to apply mutation to composition: " + String.valueOf(utvVar.getClass()) + '\n' + str);
    }
}
