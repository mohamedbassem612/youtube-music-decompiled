package app.rive.runtime.kotlin.controllers;

import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ControllerState {
    public static final int $stable = 8;
    private final Artboard activeArtboard;
    private final List animations;
    private final File file;
    private final boolean isActive;
    private final HashSet playingAnimations;
    private final HashSet playingStateMachines;
    private final List stateMachines;

    public ControllerState(File file, Artboard artboard, List list, HashSet hashSet, List list2, HashSet hashSet2, boolean z) {
        file.getClass();
        artboard.getClass();
        list.getClass();
        hashSet.getClass();
        list2.getClass();
        hashSet2.getClass();
        this.file = file;
        this.activeArtboard = artboard;
        this.animations = list;
        this.playingAnimations = hashSet;
        this.stateMachines = list2;
        this.playingStateMachines = hashSet2;
        this.isActive = z;
    }

    public final void dispose() {
        this.file.release();
        this.activeArtboard.release();
    }

    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    public final List getAnimations() {
        return this.animations;
    }

    public final File getFile() {
        return this.file;
    }

    public final HashSet getPlayingAnimations() {
        return this.playingAnimations;
    }

    public final HashSet getPlayingStateMachines() {
        return this.playingStateMachines;
    }

    public final List getStateMachines() {
        return this.stateMachines;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public static /* synthetic */ void getAnimations$annotations() {
    }

    public static /* synthetic */ void getPlayingAnimations$annotations() {
    }

    public static /* synthetic */ void getPlayingStateMachines$annotations() {
    }

    public static /* synthetic */ void getStateMachines$annotations() {
    }
}
