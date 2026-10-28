package defpackage;

import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.protobuf.ExtensionRegistryLite;
import io.grpc.Status;
import j$.util.Optional;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class zj {
    public Object a;
    public Object b;
    public Object c;

    public zj(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = new abmn(15);
        this.b = new abmn(16);
        this.a = new abmn(17);
    }

    public final ElementsRetainedState a() {
        if (this.a == null) {
            this.a = new ElementsRetainedState();
        }
        return (ElementsRetainedState) this.a;
    }

    public final void b(awmd awmdVar, boolean z) {
        Object obj;
        Object obj2 = this.c;
        if (obj2 != null) {
            try {
                try {
                    ((opl) obj2).close();
                    this.c = null;
                } catch (Exception e) {
                    ((oui) awmdVar.io()).c(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to close NodeTreeProcessor", e);
                    this.c = null;
                }
            } catch (Throwable th) {
                this.c = null;
                throw th;
            }
        }
        if (!z || (obj = this.a) == null) {
            return;
        }
        ((ElementsRetainedState) obj).close();
        this.a = null;
    }

    public final aeqo c() {
        Object obj;
        Object obj2 = this.c;
        if (obj2 != null && (obj = this.a) != null) {
            return new aeqo((byte[]) this.b, (String) obj2, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" mimeType");
        }
        if (this.a == null) {
            sb.append(" fileName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d() {
        this.c = "text/plain";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    public final void e(boolean z) {
        if (z) {
            this.b.run();
        } else {
            this.c.run();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [abua, java.lang.Object] */
    public final abuc f() {
        if (this.b != null && this.a != null) {
            Object obj = this.b;
            return new abuc((abul) obj, (abtz) this.a, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" index");
        }
        if (this.a == null) {
            sb.append(" navType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(abul abulVar) {
        if (abulVar == null) {
            throw new NullPointerException("Null index");
        }
        this.b = abulVar;
    }

    public final void h(int i) {
        g(new abul(i, null));
    }

    public final aagz i() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.c) != null) {
            return new aagz((aqpc) obj2, (Optional) this.b, (agke) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" transferState");
        }
        if (this.c == null) {
            sb.append(" transferStatusReasons");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(aqpe aqpeVar) {
        this.b = Optional.of(aqpeVar);
    }

    public final xrg k() {
        Object obj = this.c;
        return new xrg((xyv) obj, (Optional) this.b, (amyv) this.a);
    }

    public final void l(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null optionalTransferSessionState");
        }
        this.b = optional;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ahge, java.lang.Object] */
    public final Status m(String str, byte[] bArr, byte[] bArr2) {
        ?? r1;
        try {
            ahlm.a();
            ahfu ahfuVar = ahgi.b;
            ahfy ahfyVarE = ahfy.e(bArr, ahfuVar);
            ahfu ahfuVar2 = ahll.a;
            this.a = (ahge) ahfyVarE.g(ahfuVar2, ahge.class);
            this.b = str;
            atpz atpzVar = (atpz) aihn.parseFrom(atpz.a, bArr2, ExtensionRegistryLite.getGeneratedRegistry());
            if ((atpzVar.b & 1) == 0) {
                throw new GeneralSecurityException("Missing signed_keyset");
            }
            atqb atqbVar = atpzVar.c;
            if (atqbVar == null) {
                atqbVar = atqb.a;
            }
            int i = atqbVar.b;
            if ((i & 2) == 0) {
                throw new GeneralSecurityException("Missing signedKeyset.keyset");
            }
            if ((i & 1) == 0) {
                throw new GeneralSecurityException("Missing signedKeyset.identifier");
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            if ((atqbVar.b & 8) != 0) {
                aijp aijpVar = atqbVar.e;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                if (jCurrentTimeMillis < aijpVar.b) {
                    aijp aijpVar2 = atqbVar.e;
                    if (aijpVar2 == null) {
                        aijpVar2 = aijp.a;
                    }
                    throw new GeneralSecurityException("Expired certificate: current time is before signed_keyset validity period. now = " + jCurrentTimeMillis + ", valid_after = " + aijpVar2.b);
                }
            }
            if ((atqbVar.b & 4) != 0) {
                aijp aijpVar3 = atqbVar.d;
                if (aijpVar3 == null) {
                    aijpVar3 = aijp.a;
                }
                if (jCurrentTimeMillis > aijpVar3.b) {
                    aijp aijpVar4 = atqbVar.d;
                    if (aijpVar4 == null) {
                        aijpVar4 = aijp.a;
                    }
                    throw new GeneralSecurityException("Expired certificate: current time has passed signed_keyset validity period. now = " + jCurrentTimeMillis + ", valid_before = " + aijpVar4.b);
                }
            }
            if (atpzVar.d.size() <= 0) {
                throw new GeneralSecurityException("No Signatures found");
            }
            Iterator it = atpzVar.d.iterator();
            while (it.hasNext()) {
                int i2 = ((atqa) it.next()).b;
                if ((i2 & 1) == 0 || (i2 & 2) == 0) {
                    throw new GeneralSecurityException("Missing Signature or Signature Identifier");
                }
            }
            atqb atqbVar2 = atpzVar.c;
            if (atqbVar2 == null) {
                atqbVar2 = atqb.a;
            }
            byte[] byteArray = atqbVar2.toByteArray();
            for (atqa atqaVar : atpzVar.d) {
                if (atqaVar.d.equals(this.b) && (r1 = this.a) != 0) {
                    r1.a(atqaVar.c.G(), byteArray);
                    atqb atqbVar3 = atpzVar.c;
                    if (atqbVar3 == null) {
                        atqbVar3 = atqb.a;
                    }
                    this.c = (ahge) ahfy.e(atqbVar3.c.G(), ahfuVar).g(ahfuVar2, ahge.class);
                    return Status.OK;
                }
            }
            throw new GeneralSecurityException("Intermediate certificate not signed by known root certificate");
        } catch (IOException e) {
            String message = e.getMessage();
            return message != null ? Status.m.withDescription(message) : Status.m;
        } catch (GeneralSecurityException e2) {
            String message2 = e2.getMessage();
            return message2 != null ? Status.m.withDescription(message2) : Status.m;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahge, java.lang.Object] */
    public final Status n(byte[] bArr, byte[] bArr2) {
        ?? r0 = this.c;
        if (r0 == 0) {
            return Status.m.withDescription("Intermediate verifier not available.");
        }
        try {
            r0.a(bArr, bArr2);
            return Status.OK;
        } catch (GeneralSecurityException e) {
            String message = e.getMessage();
            return message != null ? Status.g.withDescription(message) : Status.g;
        }
    }

    public zj(atgg atggVar) {
        this.b = atggVar;
    }

    public zj() {
    }

    public zj(byte[] bArr, char[] cArr) {
        this.b = "";
        this.a = "";
        this.c = "";
    }

    public zj(byte[] bArr, short[] sArr) {
        this.b = Optional.empty();
    }

    public zj(short[] sArr) {
        this.b = Optional.empty();
    }
}
