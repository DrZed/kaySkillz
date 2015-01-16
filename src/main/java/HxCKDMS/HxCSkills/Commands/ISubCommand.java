package HxCKDMS.HxCSkills.Commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import java.util.List;

public interface ISubCommand {
    public String getName();

    public void execute(ICommandSender sender, String[] args) throws CommandException;

    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args);
}