package defpackage;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wb {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final KeyAgreement d;
    public final IdentityCredential e;
    public final PresentationSession f;
    public final long g;

    @Deprecated
    public wb(IdentityCredential identityCredential) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = identityCredential;
        this.f = null;
        this.g = 0L;
    }

    public wb(long j) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = j;
    }

    public wb(PresentationSession presentationSession) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = presentationSession;
        this.g = 0L;
    }

    public wb(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    public wb(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    public wb(KeyAgreement keyAgreement) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = keyAgreement;
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    public wb(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0L;
    }
}
