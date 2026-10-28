package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.BlocksSignalSubscriptionProcessorRegistrar;
import com.google.android.libraries.elements.interfaces.CapabilitiesStore;
import com.google.android.libraries.elements.interfaces.CapabilitiesSubscriptionProcessorRegistrar;
import com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.JSBlocksContainerProvider;
import com.google.android.libraries.elements.interfaces.JSCommandResolver;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.JSSubscriptionProcessors;
import com.google.android.libraries.elements.interfaces.QueriesSubscriptionProcessorRegistrar;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrarUpb;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorResolver;
import com.google.android.libraries.elements.interfaces.ThemeStore;
import com.google.android.libraries.elements.interfaces.ThemeSubscriptionProcessorRegistrar;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbk extends SubscriptionProcessorRegistrarUpb {
    private final aunn a;
    private final awmd b;
    private final Optional c;
    private final Optional d;
    private final aunn e;
    private final aunn f;
    private final Optional g;
    private final Optional h;
    private final awmd i;
    private final boolean j;

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public adbk(aunn aunnVar, awmd awmdVar, Optional optional, aunn aunnVar2, aunn aunnVar3, Optional optional2, Optional optional3, awmd awmdVar2, boolean z) {
        this.a = aunnVar;
        this.b = awmdVar;
        this.e = aunnVar2;
        this.f = aunnVar3;
        this.c = optional;
        optional.isPresent();
        this.d = Optional.ofNullable(new adbj(optional.get()));
        this.g = optional2;
        this.h = optional3;
        this.i = awmdVar2;
        this.j = z;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [awmd, java.lang.Object] */
    @Override // com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrarUpb
    public final void registerProcessors(SubscriptionProcessorResolver subscriptionProcessorResolver) {
        DebuggerClient debuggerClient;
        JSSubscriptionProcessors.registerProcessorsUpb(((JSEnvironment) this.a.io()).getController(), subscriptionProcessorResolver, (JSCommandResolver) this.b.io(), (JSBlocksContainerProvider) this.d.orElse(null));
        Optional optionalA = ((adah) this.i.io()).a();
        if (optionalA.isPresent()) {
            ((QueriesSubscriptionProcessorRegistrar) optionalA.get()).registerUpbProcessors(subscriptionProcessorResolver);
        }
        ThemeStore themeStore = (ThemeStore) this.e.io();
        if (themeStore != null) {
            ThemeSubscriptionProcessorRegistrar.registerProcessorUpb(subscriptionProcessorResolver, themeStore);
        }
        CapabilitiesStore capabilitiesStore = (CapabilitiesStore) this.f.io();
        if (capabilitiesStore != null) {
            CapabilitiesSubscriptionProcessorRegistrar.registerProcessorUpb(subscriptionProcessorResolver, capabilitiesStore);
        }
        Optional optional = this.c;
        optional.isPresent();
        if (this.j) {
            Optional optional2 = this.h;
            optional2.isPresent();
            debuggerClient = (DebuggerClient) optional2.get().io();
        } else {
            debuggerClient = null;
        }
        BlocksSignalSubscriptionProcessorRegistrar.registerProcessorUpb(subscriptionProcessorResolver, (Container) optional.get().io(), (ClientErrorLoggerAdapter) this.g.orElse(null), debuggerClient);
    }
}
