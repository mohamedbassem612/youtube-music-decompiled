package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class atas extends mew implements mes {
    public static final /* synthetic */ int h = 0;
    public final AtomicReference f;
    public boolean g;

    static {
        atar.a.d(2);
    }

    public atas() {
        super(atar.a);
        this.f = new AtomicReference();
        this.g = false;
    }

    public void aR() {
        if (this.g) {
            AtomicReference atomicReference = this.f;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 12 : 32);
            } else {
                aN((ArrayList) atomicReference.get());
            }
            this.g = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    public atas(UpbMessage upbMessage) {
        super(upbMessage);
        this.f = new AtomicReference();
        this.g = false;
    }
}
