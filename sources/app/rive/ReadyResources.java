package app.rive;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ReadyResources {
    private final Artboard artboard;
    private final StateMachine stateMachine;

    public ReadyResources(Artboard artboard, StateMachine stateMachine) {
        artboard.getClass();
        stateMachine.getClass();
        this.artboard = artboard;
        this.stateMachine = stateMachine;
    }

    public static /* synthetic */ ReadyResources copy$default(ReadyResources readyResources, Artboard artboard, StateMachine stateMachine, int i, Object obj) {
        if ((i & 1) != 0) {
            artboard = readyResources.artboard;
        }
        if ((i & 2) != 0) {
            stateMachine = readyResources.stateMachine;
        }
        return readyResources.copy(artboard, stateMachine);
    }

    public final Artboard component1() {
        return this.artboard;
    }

    public final StateMachine component2() {
        return this.stateMachine;
    }

    public final ReadyResources copy(Artboard artboard, StateMachine stateMachine) {
        artboard.getClass();
        stateMachine.getClass();
        return new ReadyResources(artboard, stateMachine);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReadyResources) {
            ReadyResources readyResources = (ReadyResources) obj;
            if (awrc.c(this.artboard, readyResources.artboard) && awrc.c(this.stateMachine, readyResources.stateMachine)) {
                return true;
            }
        }
        return false;
    }

    public final Artboard getArtboard() {
        return this.artboard;
    }

    public final StateMachine getStateMachine() {
        return this.stateMachine;
    }

    public int hashCode() {
        return (this.artboard.hashCode() * 31) + this.stateMachine.hashCode();
    }

    public String toString() {
        return "ReadyResources(artboard=" + this.artboard + ", stateMachine=" + this.stateMachine + ')';
    }
}
