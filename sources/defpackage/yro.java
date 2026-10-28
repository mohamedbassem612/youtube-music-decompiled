package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yro {
    public final aigj a;
    public final aigj b;
    public final aigj c;
    public final aigj d;

    public yro(aigj aigjVar, aigj aigjVar2, aigj aigjVar3, aigj aigjVar4) {
        if (aigjVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = aigjVar;
        if (aigjVar2 == null) {
            throw new NullPointerException("Null hmac");
        }
        this.b = aigjVar2;
        if (aigjVar3 == null) {
            throw new NullPointerException("Null iv");
        }
        this.c = aigjVar3;
        if (aigjVar4 == null) {
            throw new NullPointerException("Null encryptedKey");
        }
        this.d = aigjVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yro) {
            yro yroVar = (yro) obj;
            if (this.a.equals(yroVar.a) && this.b.equals(yroVar.b) && this.c.equals(yroVar.c) && this.d.equals(yroVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1231;
    }

    public final String toString() {
        aigj aigjVar = this.d;
        aigj aigjVar2 = this.c;
        aigj aigjVar3 = this.b;
        return "OnesieEncryptionData{content=" + String.valueOf(this.a) + ", hmac=" + String.valueOf(aigjVar3) + ", iv=" + String.valueOf(aigjVar2) + ", encryptedKey=" + String.valueOf(aigjVar) + ", useCompression=true}";
    }

    public yro() {
        throw null;
    }
}
