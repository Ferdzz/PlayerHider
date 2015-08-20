package com.ferdz.playerhider.command;

import java.util.Arrays;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.ferdz.playerhider.PlayerHider;

public class PlayerHiderCommand implements ICommand {

	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return null;
	}

	@Override
	public List<String> getAliases() {
		return Arrays.asList("ph", "playerhider");
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		if (args.length == 0) {
			PlayerHider.enabled = !PlayerHider.enabled;
			if(PlayerHider.enabled)
				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Player hiding is now enabled"));
			else
				sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Player hiding is now disabled"));
		}
	}

	@Override
	public boolean canCommandSenderUse(ICommandSender sender) {
		return true;
	}

	@Override
	public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}
}
