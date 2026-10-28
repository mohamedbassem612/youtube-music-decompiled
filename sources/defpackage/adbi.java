package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
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
import com.google.android.libraries.elements.interfaces.SubscriptionObserverConfig;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrar;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorResolver;
import com.google.android.libraries.elements.interfaces.ThemeStore;
import com.google.android.libraries.elements.interfaces.ThemeSubscriptionProcessorRegistrar;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbi extends SubscriptionProcessorRegistrar {
    private final aunn a;
    private final awmd b;
    private final awmd c;
    private final Optional d;
    private final Optional e;
    private final aunn f;
    private final aunn g;
    private final Optional h;
    private final Optional i;
    private final boolean j;

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public adbi(aunn aunnVar, awmd awmdVar, Optional optional, awmd awmdVar2, aunn aunnVar2, aunn aunnVar3, Optional optional2, Optional optional3, boolean z) {
        this.a = aunnVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.f = aunnVar2;
        this.g = aunnVar3;
        this.d = optional;
        optional.isPresent();
        this.e = Optional.ofNullable(new adbh(optional.get()));
        this.h = optional2;
        this.i = optional3;
        this.j = z;
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [awmd, java.lang.Object] */
    @Override // com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrar
    public final void registerProcessors(SubscriptionProcessorResolver subscriptionProcessorResolver, SubscriptionObserverConfig subscriptionObserverConfig, String str, BlockRegistryProvider blockRegistryProvider) {
        DebuggerClient debuggerClient;
        JSSubscriptionProcessors.registerProcessors(((JSEnvironment) this.a.io()).getController(), subscriptionProcessorResolver, (JSCommandResolver) this.b.io(), (JSBlocksContainerProvider) this.e.orElse(null), str, blockRegistryProvider);
        Optional optionalA = ((adah) this.c.io()).a();
        if (optionalA.isPresent()) {
            ((QueriesSubscriptionProcessorRegistrar) optionalA.get()).registerProcessors(subscriptionProcessorResolver);
        }
        ThemeStore themeStore = (ThemeStore) this.f.io();
        if (themeStore != null) {
            ThemeSubscriptionProcessorRegistrar.registerProcessor(subscriptionProcessorResolver, themeStore, subscriptionObserverConfig);
        }
        CapabilitiesStore capabilitiesStore = (CapabilitiesStore) this.g.io();
        if (capabilitiesStore != null) {
            CapabilitiesSubscriptionProcessorRegistrar.registerProcessor(subscriptionProcessorResolver, capabilitiesStore);
        }
        Optional optional = this.d;
        optional.isPresent();
        if (this.j) {
            Optional optional2 = this.i;
            optional2.isPresent();
            debuggerClient = (DebuggerClient) optional2.get().io();
        } else {
            debuggerClient = null;
        }
        BlocksSignalSubscriptionProcessorRegistrar.registerProcessor(subscriptionProcessorResolver, (Container) optional.get().io(), str, blockRegistryProvider, (ClientErrorLoggerAdapter) this.h.orElse(null), debuggerClient);
    }
}
